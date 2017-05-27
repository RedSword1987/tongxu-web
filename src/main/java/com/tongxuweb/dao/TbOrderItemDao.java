package com.tongxuweb.dao;

import com.tongxuweb.mapper.generate.TbOrderItemMapper;

/**
 */
public interface TbOrderItemDao extends TbOrderItemMapper {

    int refreshPrice();
}
