package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.TbStaticSize;
import com.tongxuweb.domain.generate.TbStaticSizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStaticSizeMapper {
    int countByExample(TbStaticSizeExample example);

    int deleteByExample(TbStaticSizeExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(TbStaticSize record);

    List<TbStaticSize> selectByExample(TbStaticSizeExample example);

    TbStaticSize selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbStaticSize record, @Param("example") TbStaticSizeExample example);

    int updateByPrimaryKeySelective(TbStaticSize record);
}