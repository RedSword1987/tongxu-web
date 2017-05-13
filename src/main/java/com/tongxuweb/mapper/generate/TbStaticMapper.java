package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.TbStatic;
import com.tongxuweb.domain.generate.TbStaticExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStaticMapper {
    int countByExample(TbStaticExample example);

    int deleteByExample(TbStaticExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(TbStatic record);

    List<TbStatic> selectByExample(TbStaticExample example);

    TbStatic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbStatic record, @Param("example") TbStaticExample example);

    int updateByPrimaryKeySelective(TbStatic record);
}