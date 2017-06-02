package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.TbOrderStatusInfo;
import com.tongxuweb.domain.generate.TbOrderStatusInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderStatusInfoMapper {
    int countByExample(TbOrderStatusInfoExample example);

    int deleteByExample(TbOrderStatusInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(TbOrderStatusInfo record);

    List<TbOrderStatusInfo> selectByExample(TbOrderStatusInfoExample example);

    TbOrderStatusInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbOrderStatusInfo record, @Param("example") TbOrderStatusInfoExample example);

    int updateByPrimaryKeySelective(TbOrderStatusInfo record);
}