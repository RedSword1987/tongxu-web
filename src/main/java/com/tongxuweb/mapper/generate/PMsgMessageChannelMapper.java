package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PMsgMessageChannel;
import com.tongxuweb.domain.generate.PMsgMessageChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PMsgMessageChannelMapper {
    int countByExample(PMsgMessageChannelExample example);

    int deleteByExample(PMsgMessageChannelExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PMsgMessageChannel record);

    List<PMsgMessageChannel> selectByExample(PMsgMessageChannelExample example);

    PMsgMessageChannel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PMsgMessageChannel record, @Param("example") PMsgMessageChannelExample example);

    int updateByPrimaryKeySelective(PMsgMessageChannel record);
}