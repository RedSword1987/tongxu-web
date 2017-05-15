package com.tongxuweb.service.impl;

import com.tongxuweb.dao.*;
import com.tongxuweb.domain.create.TaskRunExtend;
import com.tongxuweb.domain.create.TbOrderExtend;
import com.tongxuweb.domain.entity.MainOrder;
import com.tongxuweb.domain.entity.MainOrders;
import com.tongxuweb.domain.entity.common.KeyMap;
import com.tongxuweb.domain.entity.mainOrder.Operation;
import com.tongxuweb.domain.entity.mainOrder.SubOrder;
import com.tongxuweb.domain.generate.*;
import com.tongxuweb.service.interceptor.OutSideService;
import com.tongxuweb.util.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by red
 */
@Service
public class OutSideServiceImpl implements OutSideService {
    @Resource
    private TbStaticDao tbStaticDao;

    @Resource
    private TbOrderDao tbOrderDao;

    @Resource
    private TbOrderItemDao tbOrderItemDao;

    @Resource
    private TaskRunDao taskRunDao;

    @Resource
    private TaskRunParamDao taskRunParamDao;

    public Integer saveOrders(MainOrders mainOrders, Map<String, Object> ss) {
        Integer insert = 0;
        Integer update = 0;
        List<TbOrderExtend> list = convert(mainOrders);
        for (TbOrderExtend tbOrderExtend : list) {
            tbOrderExtend.setTaskId(mainOrders.getBatchId());
            if (!StringUtil.isEmpty(tbOrderExtend.getOrderinfoId())) {
                TbOrderExample example = new TbOrderExample();
                example.createCriteria().andOrderinfoIdEqualTo(tbOrderExtend.getOrderinfoId());
                List<TbOrder> lli = tbOrderDao.selectByExample(example);
                if (lli != null && lli.size() > 0) {
                    tbOrderExtend.setId(lli.get(0).getId());
                    tbOrderDao.updateByPrimaryKeySelective(tbOrderExtend);
                    update++;
                } else {

                    tbOrderDao.insertSelective(tbOrderExtend);
                    if (tbOrderExtend.getTbOrderItemList() != null) {
                        for (TbOrderItem tbOrderItem : tbOrderExtend.getTbOrderItemList()) {
                            tbOrderItemDao.insertSelective(tbOrderItem);
                        }
                    }
                    insert++;
                }
            }
        }

        ss.put("insert", insert);
        ss.put("update", update);
        return list.size();
    }

    public List<TaskRunExtend> getNeedTask() {
        List<TaskRunExtend> result = new ArrayList<TaskRunExtend>();
        TaskRunExample taskRunExample = new TaskRunExample();
        taskRunExample.createCriteria().andStatusEqualTo(1);
        taskRunExample.setOrderByClause(" id desc limit 1");

        List<TaskRun> li = taskRunDao.selectByExample(taskRunExample);

        for (TaskRun taskRun : li) {
            TaskRunExtend taskRunExtend = new TaskRunExtend();
            taskRunExtend.setId(taskRun.getId());
            taskRunExtend.setTaskName(taskRun.getTaskName());
            taskRunExtend.setCode(taskRun.getCode());
            taskRunExtend.setStatus(taskRun.getStatus());

            TaskRunParamExample taskRunParamExample = new TaskRunParamExample();
            taskRunParamExample.createCriteria().andTaskRunIdEqualTo(taskRun.getId());
            List<TaskRunParam> paramList = taskRunParamDao.selectByExample(taskRunParamExample);
            Map<String, Object> paramMap = new HashMap<String, Object>();
            for (TaskRunParam taskRunParam : paramList) {
                paramMap.put(taskRunParam.getKeyEn(), taskRunParam.getKeyValue());
            }

            taskRunExtend.setParam(paramMap);


            result.add(taskRunExtend);
        }
        return result;
    }

    public int taskRunStatus(TaskRun taskRun) {
        return taskRunDao.updateByPrimaryKeySelective(taskRun);
    }


    private List<TbOrderExtend> convert(MainOrders mainOrders) {
        List<TbOrderExtend> list = new ArrayList<TbOrderExtend>();
        if (mainOrders.getMainOrders() != null) {
            for (MainOrder mainOrder : mainOrders.getMainOrders()) {
                if (mainOrder != null) {


                    TbOrderExtend tbOrderExtend = new TbOrderExtend();
                    tbOrderExtend.setOrderinfoId(mainOrder.getId());
                    if (mainOrder.getTrade() != null) {
                        tbOrderExtend.setAlipayId(mainOrder.getTrade().getAlipayId());
                        tbOrderExtend.setBuyerAddress(mainOrder.getTrade().getBuyerAddress());
                        tbOrderExtend.setBuyMessage(mainOrder.getTrade().getBuyMessage());
                        tbOrderExtend.setCreateTime(mainOrder.getTrade().getCreateTime());
                        tbOrderExtend.setLogisticsName(mainOrder.getTrade().getLogisticsName());
                        tbOrderExtend.setLogisticsNum(mainOrder.getTrade().getLogisticsNum());
                        tbOrderExtend.setOrderBar(mainOrder.getTrade().getOrderBar());
                        tbOrderExtend.setOrderBarText(mainOrder.getTrade().getOrderBarText());
                        tbOrderExtend.setPayTime(mainOrder.getTrade().getPayTime());
                        tbOrderExtend.setSendTime(mainOrder.getTrade().getSendTime());


                        tbOrderExtend.setLogisticsDesc(mainOrder.getTrade().getLogisticsDesc());
                        tbOrderExtend.setLogisticsLastDesc(mainOrder.getTrade().getLogisticsLastDesc());
                        tbOrderExtend.setLogisticsNumTaobao(mainOrder.getTrade().getLogisticsNumTaobao());
                    }

                    if (mainOrder.getBuyer() != null) {
                        tbOrderExtend.setBuyerId(mainOrder.getBuyer().getId());
                        tbOrderExtend.setBuyerNick(mainOrder.getBuyer().getNick());
                        tbOrderExtend.setBuyerPhonenum(mainOrder.getBuyer().getPhoneNum());
                    }
                    if (mainOrder.getOrderInfo() != null) {
                        tbOrderExtend.setOrderinfoCreatetime(mainOrder.getOrderInfo().getCreateTime());

                    }
                    if (mainOrder.getPayInfo() != null && mainOrder.getPayInfo().getActualFee() != null) {
                        tbOrderExtend.setPayinfoActualfee(new BigDecimal(Double.valueOf(mainOrder.getPayInfo().getActualFee())));
                    }
                    if (mainOrder.getStatusInfo() != null) {
                        tbOrderExtend.setStatusinfoText(String.valueOf(mainOrder.getStatusInfo().getText()).trim());
                        tbOrderExtend.setStatusinfoType(mainOrder.getStatusInfo().getType());
                    }
                    if (mainOrder.getOperations() != null && mainOrder.getOperations().size() > 0) {
                        Operation operation = mainOrder.getOperations().get(0);
                        if (operation != null) {
                            String url = operation.getUrl();
                            if (!StringUtil.isEmpty(url) && url.indexOf("seller_id") != -1) {
                                int sellerIdIndex = url.indexOf("seller_id=");
                                url = url.substring(sellerIdIndex + 10);
                                System.out.println(url);
                                int yuIndex = url.indexOf("&");
                                if (yuIndex != -1) {
                                    url = url.substring(0, yuIndex);
                                }
                                tbOrderExtend.setSellerId(url);
                            }
                        }
                    }

                    if (mainOrder.getSubOrders() != null && mainOrder.getSubOrders().size() > 0) {
                        List<TbOrderItem> items = new ArrayList<TbOrderItem>();
                        for (SubOrder subOrder : mainOrder.getSubOrders()) {
                            TbOrderItem tbOrderItem = new TbOrderItem();
                            tbOrderItem.setNum(subOrder.getQuantity());
                            tbOrderItem.setOrderinfoId(mainOrder.getId());
                            tbOrderItem.setSellerId(tbOrderExtend.getSellerId());
                            List<KeyMap> dd = subOrder.getItemInfo().getSkuText();
                            if (dd != null) {
                                for (KeyMap keyMap : dd) {
                                    if (keyMap != null) {
                                        if (String.valueOf(keyMap.getName()).indexOf("颜色分类") != -1) {
                                            tbOrderItem.setSkuTextColour(keyMap.getValue());
                                        } else if (String.valueOf(keyMap.getName()).indexOf("尺寸") != -1) {
                                            String colour = keyMap.getValue();
                                            if (colour.length() > 6) {
                                                tbOrderItem.setSkuTextSize(colour.substring(2, 5));
                                            }
                                        }
                                    }
                                }
                            }
                            items.add(tbOrderItem);
                        }

                        tbOrderExtend.setTbOrderItemList(items);
                    }


                    initStatus(tbOrderExtend);

                    initTbOrderMoney(tbOrderExtend);

                    initTaskGetdataTaobaoOrder(tbOrderExtend);


                    list.add(tbOrderExtend);
                }
            }
        }


        return list;

    }

    private static void initStatus(TbOrderExtend tbOrderExtend) {
        if (tbOrderExtend != null && tbOrderExtend.getStatusinfoText() != null) {
            if ("交易关闭".equals(tbOrderExtend.getStatusinfoText())) {
                tbOrderExtend.setStatus(0);
            } else if ("等待买家付款".equals(tbOrderExtend.getStatusinfoText())) {
                tbOrderExtend.setStatus(0);
            } else if ("买家已付款".equals(tbOrderExtend.getStatusinfoText())) {
                tbOrderExtend.setStatus(1);
            } else if ("卖家已发货".equals(tbOrderExtend.getStatusinfoText())) {
                tbOrderExtend.setStatus(1);
            } else if ("交易成功".equals(tbOrderExtend.getStatusinfoText())) {
                tbOrderExtend.setStatus(1);
            } else if ("资金保护中".equals(tbOrderExtend.getStatusinfoText())) {
                tbOrderExtend.setStatus(1);
            }
        }

    }

    private static void initTbOrderMoney(TbOrderExtend tbOrderExtend) {
        if (tbOrderExtend != null) {
            if (tbOrderExtend.getPayinfoActualfee() != null) {
                tbOrderExtend.setMoneyYunyinYongjin(new BigDecimal(tbOrderExtend.getPayinfoActualfee().doubleValue() * 0.3));
                tbOrderExtend.setMoneyYunyinFuwufei(new BigDecimal(tbOrderExtend.getPayinfoActualfee().doubleValue() * 0.06));


                Double finalMoney = tbOrderExtend.getPayinfoActualfee().doubleValue();
                if (tbOrderExtend.getMoneyYunyinYongjin() != null) {
                    finalMoney = finalMoney - tbOrderExtend.getMoneyYunyinYongjin().doubleValue();
                }
                if (tbOrderExtend.getMoneyYunyinFuwufei() != null) {
                    finalMoney = finalMoney - tbOrderExtend.getMoneyYunyinFuwufei().doubleValue();
                }
                if (tbOrderExtend.getMoneyYunyinKoudian() != null) {
                    finalMoney = finalMoney - tbOrderExtend.getMoneyYunyinKoudian().doubleValue();
                }
                if (tbOrderExtend.getMoneyYunyinYouhuiquan() != null) {
                    finalMoney = finalMoney - tbOrderExtend.getMoneyYunyinYouhuiquan().doubleValue();
                }
                if (tbOrderExtend.getMoneyYunyinTeshu() != null) {
                    finalMoney = finalMoney - tbOrderExtend.getMoneyYunyinTeshu().doubleValue();
                }
                if (tbOrderExtend.getMoneyWuliuKuaidi() != null) {
                    finalMoney = finalMoney - tbOrderExtend.getMoneyWuliuKuaidi().doubleValue();
                }
                if (tbOrderExtend.getMoneyWuliuChangku() != null) {
                    finalMoney = finalMoney - tbOrderExtend.getMoneyWuliuChangku().doubleValue();
                }
                if (tbOrderExtend.getMoneyWuliuBaozhuang() != null) {
                    finalMoney = finalMoney - tbOrderExtend.getMoneyWuliuBaozhuang().doubleValue();
                }
                if (tbOrderExtend.getMoneyWuliuYunfeixian() != null) {
                    finalMoney = finalMoney - tbOrderExtend.getMoneyWuliuYunfeixian().doubleValue();
                }

                tbOrderExtend.setMoneyFinalMoney(new BigDecimal(finalMoney));
            }
        }
    }


    private static void initTaskGetdataTaobaoOrder(TbOrderExtend tbOrderExtend) {
        if (tbOrderExtend != null && !StringUtil.isEmpty(tbOrderExtend.getBuyerAddress())) {
            String address = tbOrderExtend.getBuyerAddress();
            String[] arr = address.split("，");
            if (arr.length >= 4) {
                tbOrderExtend.setBuyerName(arr[0]);
                if (!StringUtil.isEmpty(arr[1]) && arr[1].length() > 3) {
                    if (arr[1].startsWith("86-")) {
                        arr[1] = arr[1].substring(3);
                    }
                    tbOrderExtend.setBuyerLogisticsPhone(arr[1]);
                    if (!StringUtil.isEmpty(arr[1]) && arr[1].length() == 11) {
                        String s7 = arr[1].substring(0, 7);
                        int a = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
                        tbOrderExtend.setBuyerVirtualPhone(s7 + String.valueOf(a));
                    }
                }

                String buyer_post = arr[arr.length - 1].toString();
                if (buyer_post.length() == 6) {
                    tbOrderExtend.setBuyerPost(buyer_post);
                }
                String buyer_address = arr[arr.length - 2];
                String[] buyer_addressArray = buyer_address.split(" ");
                if (buyer_addressArray.length >= 3) {
                    tbOrderExtend.setBuyerProvice(buyer_addressArray[0]);
                    tbOrderExtend.setBuyerCity(buyer_addressArray[1]);

                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i = 0; i < buyer_addressArray.length; i++) {
                        if (i > 1) {
                            stringBuilder.append(buyer_addressArray[i]).append(" ");
                        }
                    }
                    tbOrderExtend.setBuyerArea(stringBuilder.toString().trim());
                }
                tbOrderExtend.setBuyerAddress(buyer_address);
            }
        }

    }
}
