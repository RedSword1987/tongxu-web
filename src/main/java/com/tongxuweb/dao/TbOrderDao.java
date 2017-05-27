package com.tongxuweb.dao;

import com.tongxuweb.mapper.generate.TbOrderMapper;

/**
 */
public interface TbOrderDao extends TbOrderMapper {

    int refreshPrice();

    int refreshFinalMoney();
}
