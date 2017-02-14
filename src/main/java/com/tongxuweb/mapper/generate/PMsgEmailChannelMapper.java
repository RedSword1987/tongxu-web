package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PMsgEmailChannel;
import com.tongxuweb.domain.generate.PMsgEmailChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PMsgEmailChannelMapper {
    int countByExample(PMsgEmailChannelExample example);

    int deleteByExample(PMsgEmailChannelExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PMsgEmailChannel record);

    List<PMsgEmailChannel> selectByExample(PMsgEmailChannelExample example);

    PMsgEmailChannel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PMsgEmailChannel record, @Param("example") PMsgEmailChannelExample example);

    int updateByPrimaryKeySelective(PMsgEmailChannel record);
}