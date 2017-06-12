package com.tongxuweb.dao;

import com.tongxuweb.mapper.generate.PConfigMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 */
public interface PConfigDao extends PConfigMapper {

    @Update("update p_config set key_value=${value} where key_en=#{key}")
    void updateByKey(@Param("key") String key, @Param("value") double value);
}
