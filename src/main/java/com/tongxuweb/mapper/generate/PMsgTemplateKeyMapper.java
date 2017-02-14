package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PMsgTemplateKey;
import com.tongxuweb.domain.generate.PMsgTemplateKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PMsgTemplateKeyMapper {
    int countByExample(PMsgTemplateKeyExample example);

    int deleteByExample(PMsgTemplateKeyExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PMsgTemplateKey record);

    List<PMsgTemplateKey> selectByExample(PMsgTemplateKeyExample example);

    PMsgTemplateKey selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PMsgTemplateKey record, @Param("example") PMsgTemplateKeyExample example);

    int updateByPrimaryKeySelective(PMsgTemplateKey record);
}