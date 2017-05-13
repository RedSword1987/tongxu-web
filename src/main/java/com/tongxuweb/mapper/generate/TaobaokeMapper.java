package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.Taobaoke;
import com.tongxuweb.domain.generate.TaobaokeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaobaokeMapper {
    int countByExample(TaobaokeExample example);

    int deleteByExample(TaobaokeExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(Taobaoke record);

    List<Taobaoke> selectByExample(TaobaokeExample example);

    Taobaoke selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Taobaoke record, @Param("example") TaobaokeExample example);

    int updateByPrimaryKeySelective(Taobaoke record);
}