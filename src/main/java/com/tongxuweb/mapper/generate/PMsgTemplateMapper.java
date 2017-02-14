package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PMsgTemplate;
import com.tongxuweb.domain.generate.PMsgTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PMsgTemplateMapper {
    int countByExample(PMsgTemplateExample example);

    int deleteByExample(PMsgTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PMsgTemplate record);

    List<PMsgTemplate> selectByExampleWithBLOBs(PMsgTemplateExample example);

    List<PMsgTemplate> selectByExample(PMsgTemplateExample example);

    PMsgTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PMsgTemplate record, @Param("example") PMsgTemplateExample example);

    int updateByPrimaryKeySelective(PMsgTemplate record);
}