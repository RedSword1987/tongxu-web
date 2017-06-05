package com.tongxuweb.dao;

import com.tongxuweb.mapper.generate.TbOrderMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 */
public interface TbOrderDao extends TbOrderMapper {

    int refreshPrice();

    int refreshFinalMoney();

    List<Map<String, Object>> listOrders(@Param("orderList") List<String> orderList);
}
