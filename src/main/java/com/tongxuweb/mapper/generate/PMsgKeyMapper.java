package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PMsgKey;
import com.tongxuweb.domain.generate.PMsgKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PMsgKeyMapper {
    int countByExample(PMsgKeyExample example);

    int deleteByExample(PMsgKeyExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PMsgKey record);

    List<PMsgKey> selectByExample(PMsgKeyExample example);

    PMsgKey selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PMsgKey record, @Param("example") PMsgKeyExample example);

    int updateByPrimaryKeySelective(PMsgKey record);
}