package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.TbOrder;
import com.tongxuweb.domain.generate.TbOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderMapper {
    int countByExample(TbOrderExample example);

    int deleteByExample(TbOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(TbOrder record);

    List<TbOrder> selectByExampleWithBLOBs(TbOrderExample example);

    List<TbOrder> selectByExample(TbOrderExample example);

    TbOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    int updateByPrimaryKeySelective(TbOrder record);
}