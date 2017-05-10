package com.tongxuweb.service.impl;

import com.tongxuweb.dao.TbStaticDao;
import com.tongxuweb.dao.TbStaticItemDao;
import com.tongxuweb.dao.TbStaticSizeDao;
import com.tongxuweb.domain.generate.TbSeller;
import com.tongxuweb.domain.generate.TbStatic;
import com.tongxuweb.domain.generate.TbStaticItem;
import com.tongxuweb.domain.generate.TbStaticSize;
import com.tongxuweb.service.TbStaticService;
import com.tongxuweb.util.DateUtil;
import com.tongxuweb.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by higgs on 17/5/8.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TbStaticServiceImpl implements TbStaticService {
    @Resource
    private TbStaticDao tbStaticDao;

    @Resource
    private TbStaticSizeDao tbStaticSizeDao;

    @Resource
    private TbStaticItemDao tbStaticItemDao;

    public Map<String, List<Map<String, Object>>> getAllLines(List<TbSeller> li) {
        Map<String, List<Map<String, Object>>> result = new HashMap<String, List<Map<String, Object>>>();
        String date = DateUtil.convertLongToString((DateUtil.getTimeLongNow() - 24 * 60 * 60), "yyyy-MM-dd");
        String beginDate = DateUtil.convertLongToString((DateUtil.getTimeLongNow() - 30 * 24 * 60 * 60), "yyyy-MM-dd");
        List<Map<String, Object>> lineList = new ArrayList<Map<String, Object>>();

        List<String> dates = DateUtil.getDayFormetBetween(DateUtil.convertStringToLong(beginDate, "yyyy-MM-dd"), DateUtil.convertStringToLong(date, "yyyy-MM-dd"), "yyyy-MM-dd");
        String allDates = StringUtil.joinListString(dates, ",");

        String sellerIds = getSellerIds(li);
        List<TbStatic> tbStaticList = tbStaticDao.listBySellerAndDate(sellerIds, beginDate, date);
        Map<String, TbStatic> tbStaticMap = convertTbStatic(tbStaticList);

        List<Map<String, Object>> finalmoney = new ArrayList<Map<String, Object>>();
        for (TbSeller tbSeller : li) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", tbSeller.getSellerName());
            map.put("dates", allDates);
            map.put("values", getLineString(tbStaticMap, dates, tbSeller.getSellerId(), 4));
            finalmoney.add(map);
        }
        List<Map<String, Object>> actualfee = new ArrayList<Map<String, Object>>();
        for (TbSeller tbSeller : li) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", tbSeller.getSellerName());
            map.put("dates", allDates);
            map.put("values", getLineString(tbStaticMap, dates, tbSeller.getSellerId(), 3));
            actualfee.add(map);
        }
        List<Map<String, Object>> payNum = new ArrayList<Map<String, Object>>();
        for (TbSeller tbSeller : li) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", tbSeller.getSellerName());
            map.put("dates", allDates);
            map.put("values", getLineString(tbStaticMap, dates, tbSeller.getSellerId(), 1));
            payNum.add(map);
        }
        List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();
        for (TbSeller tbSeller : li) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", tbSeller.getSellerName());
            map.put("dates", allDates);
            map.put("values", getLineString(tbStaticMap, dates, tbSeller.getSellerId(), 2));
            items.add(map);
        }

        result.put("finalmoney", finalmoney);
        result.put("actualfee", actualfee);
        result.put("payNum", payNum);
        result.put("items", items);
        return result;
    }

    public List<Map<String, Object>> getIndexPieList(List<TbSeller> li) {
        String sellerIdsS = getSellerIds(li);
        String endDate = DateUtil.convertLongToString((DateUtil.getTimeLongNow() - 24 * 60 * 60), "yyyy-MM-dd");
        String beginDate = DateUtil.convertLongToString((DateUtil.getTimeLongNow() - 7 * 24 * 60 * 60), "yyyy-MM-dd");
        TbStaticSize re = tbStaticSizeDao.sumSize(sellerIdsS, beginDate, endDate);
        if (re == null) {
            re = new TbStaticSize();
            re.setSize09(0);
            re.setSize10(0);
            re.setSize12(0);
            re.setSize15(0);
            re.setSize18(0);
            re.setSize20(0);
        }

        List<Map<String, Object>> allResult = new ArrayList<Map<String, Object>>();
        Map<String, Object> size09 = new HashMap<String, Object>();
        size09.put("name", "床宽0.9");
        size09.put("num", re.getSize09());

        Map<String, Object> size10 = new HashMap<String, Object>();
        size10.put("name", "床宽1.0");
        size10.put("num", re.getSize10());

        Map<String, Object> size12 = new HashMap<String, Object>();
        size12.put("name", "床宽1.2");
        size12.put("num", re.getSize12());

        Map<String, Object> size15 = new HashMap<String, Object>();
        size15.put("name", "床宽1.5");
        size15.put("num", re.getSize15());

        Map<String, Object> size18 = new HashMap<String, Object>();
        size18.put("name", "床宽1.8");
        size18.put("num", re.getSize18());

        Map<String, Object> size20 = new HashMap<String, Object>();
        size20.put("name", "床宽2.0");
        size20.put("num", re.getSize20());

        allResult.add(size09);
        allResult.add(size10);
        allResult.add(size12);
        allResult.add(size15);
        allResult.add(size18);
        allResult.add(size20);
        return allResult;
    }

    public List<TbStaticItem> getIndexTableList(List<TbSeller> li) {
        String date = DateUtil.convertLongToString((DateUtil.getTimeLongNow() - 24 * 60 * 60), "yyyy-MM-dd");
        String sellerIds = getSellerIds(li);
        List<TbStaticItem> result = tbStaticItemDao.selectTopOrderByNum(sellerIds, date);
        return result;
    }


    private String getSellerIds(List<TbSeller> li) {
        StringBuilder sellerIds = new StringBuilder();
        for (TbSeller tbSeller : li) {
            sellerIds.append(",").append(tbSeller.getSellerId());
        }
        if (sellerIds.length() > 0) {
            sellerIds = sellerIds.deleteCharAt(0);
        }
        String sellerIdsS = "'" + sellerIds.toString().replaceAll(",", "','") + "'";
        return sellerIdsS;
    }


    private String getLineString(Map<String, TbStatic> tbStaticMap, List<String> dates, String sellerId, int type) {
        StringBuilder str = new StringBuilder();
        for (String date : dates) {
            str.append(",");
            TbStatic t = tbStaticMap.get(sellerId + date);
            if (t != null) {
                if (type == 1) {
                    str.append(t.getPayNum());
                } else if (type == 2) {
                    str.append(t.getPayItems());
                } else if (type == 3) {
                    str.append(t.getPayinfoActualfee());
                } else if (type == 4) {
                    str.append(t.getFinalMoney());
                }
            } else {
                if (type == 1) {
                    str.append(0);
                } else if (type == 2) {
                    str.append(0);
                } else if (type == 3) {
                    str.append(0.00);
                } else if (type == 4) {
                    str.append(0.00);
                }
            }
        }
        str.deleteCharAt(0);
        return str.toString();
    }

    private Map<String, TbStatic> convertTbStatic(List<TbStatic> li) {
        Map<String, TbStatic> all = new HashMap<String, TbStatic>();
        if (li != null && li.size() > 0) {
            for (TbStatic tbStatic : li) {
                all.put(tbStatic.getSellerId() + "" + tbStatic.getDate(), tbStatic);
            }
        }
        return all;
    }
}