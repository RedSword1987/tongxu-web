package com.tongxuweb.dao;

import com.tongxuweb.mapper.generate.TbOrderStatusInfoMapper;

/**
 * Created by red
 */
public interface TbOrderStatusInfoDao extends TbOrderStatusInfoMapper {
    int autoImport();

    int statusInfoRefreshOrder();

}
