package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.TbStaticItem;
import com.tongxuweb.domain.generate.TbStaticItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStaticItemMapper {
    int countByExample(TbStaticItemExample example);

    int deleteByExample(TbStaticItemExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(TbStaticItem record);

    List<TbStaticItem> selectByExample(TbStaticItemExample example);

    TbStaticItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbStaticItem record, @Param("example") TbStaticItemExample example);

    int updateByPrimaryKeySelective(TbStaticItem record);
}