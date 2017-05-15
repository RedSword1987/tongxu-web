package com.tongxuweb.service.impl;

import com.tongxuweb.dao.TbOrderDao;
import com.tongxuweb.dao.TbStaticDao;
import com.tongxuweb.dao.TbStaticItemDao;
import com.tongxuweb.dao.TbStaticSizeDao;
import com.tongxuweb.domain.create.StaticSizeResult;
import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.domain.generate.*;
import com.tongxuweb.mapper.generate.TbSellerMapper;
import com.tongxuweb.service.TbService;
import com.tongxuweb.util.DateUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TbServiceImpl implements TbService {

    @Resource
    private TbStaticDao tbStaticDao;

    @Resource
    private TbSellerMapper tbSellerMapper;

    @Resource
    private TbOrderDao tbOrderDao;


    @Resource
    private TbStaticItemDao tbStaticItemDao;

    @Resource
    private TbStaticSizeDao tbStaticSizeDao;

    public PaginationResult tbStaticPage(Pagination pagination) {
        PaginationResult result = new PaginationResult();
        TbStaticExample ex = new TbStaticExample();
        ex.setOrderByClause("date desc,seller_id desc limit " + pagination.getOffset() + "," + pagination.getLimit());
        List<TbStatic> re = tbStaticDao.selectByExample(ex);

        Integer count = tbStaticDao.countByExample(ex);
        pagination.setTotal(count);


        result.setPagination(pagination);
        result.setRows(re);
        return result;
    }

    public PaginationResult tbStaticSize(Pagination pagination) {
        PaginationResult result = new PaginationResult();
        TbStaticSizeExample ex = new TbStaticSizeExample();
        ex.setOrderByClause("date desc,seller_id desc limit " + pagination.getOffset() + "," + pagination.getLimit());
        List<TbStaticSize> re = tbStaticSizeDao.selectByExample(ex);

        Integer count = tbStaticSizeDao.countByExample(ex);
        pagination.setTotal(count);


        result.setPagination(pagination);
        result.setRows(re);
        return result;
    }

    public PaginationResult tbStaticItem(Pagination pagination) {
        PaginationResult result = new PaginationResult();
        TbStaticItemExample ex = new TbStaticItemExample();
        ex.setOrderByClause("date desc,item_num desc limit " + pagination.getOffset() + "," + pagination.getLimit());
        List<TbStaticItem> re = tbStaticItemDao.selectByExample(ex);

        Integer count = tbStaticItemDao.countByExample(ex);
        pagination.setTotal(count);


        result.setPagination(pagination);
        result.setRows(re);
        return result;
    }


    public PaginationResult tbOrderPage(Pagination pagination) {
        PaginationResult result = new PaginationResult();
        TbOrderExample ex = new TbOrderExample();
        ex.createCriteria().andStatusEqualTo(1);
        ex.setOrderByClause("pay_time desc limit " + pagination.getOffset() + "," + pagination.getLimit());
        List<TbOrder> re = tbOrderDao.selectByExample(ex);

        Integer count = tbOrderDao.countByExample(ex);
        pagination.setTotal(count);


        result.setPagination(pagination);
        result.setRows(re);
        return result;
    }

    public PaginationResult tbOrderWuliuPage(Pagination pagination) {
        PaginationResult result = new PaginationResult();
        TbOrderExample ex = new TbOrderExample();
        ex.createCriteria().andStatusEqualTo(1).andLogisticsNumIsNotNull();
        ex.setOrderByClause("send_time desc limit " + pagination.getOffset() + "," + pagination.getLimit());
        List<TbOrder> re = tbOrderDao.selectByExample(ex);

        Integer count = tbOrderDao.countByExample(ex);
        pagination.setTotal(count);


        result.setPagination(pagination);
        result.setRows(re);
        return result;
    }

    public PaginationResult tbOrderMoneyPage(Pagination pagination) {
        PaginationResult result = new PaginationResult();
        TbOrderExample ex = new TbOrderExample();
        ex.createCriteria().andStatusEqualTo(1);
        ex.setOrderByClause("pay_time desc limit " + pagination.getOffset() + "," + pagination.getLimit());
        List<TbOrder> re = tbOrderDao.selectByExample(ex);

        Integer count = tbOrderDao.countByExample(ex);
        pagination.setTotal(count);


        result.setPagination(pagination);
        result.setRows(re);
        return result;
    }

    public void refreshStatic(String beginDate, String endDate) {

        List<String> dates = DateUtil.getDayFormetBetween(DateUtil.convertStringToLong(beginDate, "yyyy-MM-dd"), DateUtil.convertStringToLong(endDate, "yyyy-MM-dd"), "yyyy-MM-dd");

        TbSellerExample example = new TbSellerExample();
        example.createCriteria().andSellerStatusEqualTo(1);
        List<TbSeller> li = tbSellerMapper.selectByExample(example);

        //yyyy-MM-dd 数据格式
        for (String date : dates) {
            //1.清理数据
            TbStaticExample tbStaticExample = new TbStaticExample();
            tbStaticExample.createCriteria().andDateEqualTo(date);
            tbStaticDao.deleteByExample(tbStaticExample);

            TbStaticSizeExample tbStaticSizeExample = new TbStaticSizeExample();
            tbStaticSizeExample.createCriteria().andDateEqualTo(date);
            tbStaticSizeDao.deleteByExample(tbStaticSizeExample);

            TbStaticItemExample tbStaticItemExample = new TbStaticItemExample();
            tbStaticItemExample.createCriteria().andDateEqualTo(date);
            tbStaticItemDao.deleteByExample(tbStaticItemExample);
            //新增数据
            for (TbSeller tbSeller : li) {

                //static
                TbStatic tbStatic = new TbStatic();
                TbOrderExample ex = new TbOrderExample();
                ex.createCriteria().andSellerIdEqualTo(tbSeller.getSellerId()).andDateEqualTo(date).andStatusEqualTo(1);
                Integer payNum = tbOrderDao.countByExample(ex);
                Integer itemNum = tbStaticDao.staticItemNum(date, tbSeller.getSellerId());
                Double payinfoActualfee = tbStaticDao.staticPayinfoActualfee(date, tbSeller.getSellerId());
                Double moneyFinalMoney = tbStaticDao.staticMoneyFinalMoney(date, tbSeller.getSellerId());


                tbStatic.setDate(date);
                tbStatic.setSellerId(tbSeller.getSellerId());
                tbStatic.setSellerName(tbSeller.getSellerName());
                tbStatic.setPayNum(payNum);
                tbStatic.setPayItems(itemNum);
                if (moneyFinalMoney != null) {
                    tbStatic.setFinalMoney(new BigDecimal(moneyFinalMoney));
                }
                if (payinfoActualfee != null) {
                    tbStatic.setPayinfoActualfee(new BigDecimal(payinfoActualfee));
                }
                tbStaticDao.insertSelective(tbStatic);

                //size
                List<StaticSizeResult> liStatic = tbStaticSizeDao.staticData(date, tbSeller.getSellerId());
                if (liStatic != null && liStatic.size() > 0) {
                    TbStaticSize tbStaticSize = new TbStaticSize();
                    tbStaticSize.setSellerName(tbSeller.getSellerName());
                    tbStaticSize.setDate(date);
                    tbStaticSize.setSellerId(tbSeller.getSellerId());
                    for (StaticSizeResult staticSizeResult : liStatic) {
                        if ("0.9".equals(staticSizeResult.getSize())) {
                            tbStaticSize.setSize09(staticSizeResult.getCc());
                        } else if ("1.0".equals(staticSizeResult.getSize())) {
                            tbStaticSize.setSize10(staticSizeResult.getCc());
                        } else if ("1.2".equals(staticSizeResult.getSize())) {
                            tbStaticSize.setSize12(staticSizeResult.getCc());
                        } else if ("1.5".equals(staticSizeResult.getSize())) {
                            tbStaticSize.setSize15(staticSizeResult.getCc());
                        } else if ("1.8".equals(staticSizeResult.getSize())) {
                            tbStaticSize.setSize18(staticSizeResult.getCc());
                        } else if ("2.0".equals(staticSizeResult.getSize())) {
                            tbStaticSize.setSize20(staticSizeResult.getCc());
                        }
                    }
                    tbStaticSizeDao.insertSelective(tbStaticSize);
                }

                //item
                List<TbStaticItem> liItem = tbStaticItemDao.staticData(date, tbSeller.getSellerId());
                if (liItem != null && liItem.size() > 0) {
                    for (TbStaticItem tbStaticItem : liItem) {
                        tbStaticItem.setDate(date);
                        tbStaticItem.setSellerId(tbSeller.getSellerId());
                        tbStaticItem.setSellerName(tbSeller.getSellerName());
                        tbStaticItemDao.insertSelective(tbStaticItem);
                    }
                }

            }
        }

    }

}
