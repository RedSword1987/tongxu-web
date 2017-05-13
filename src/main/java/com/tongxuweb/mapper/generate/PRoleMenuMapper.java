package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PRoleMenu;
import com.tongxuweb.domain.generate.PRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PRoleMenuMapper {
    int countByExample(PRoleMenuExample example);

    int deleteByExample(PRoleMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PRoleMenu record);

    List<PRoleMenu> selectByExample(PRoleMenuExample example);

    PRoleMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PRoleMenu record, @Param("example") PRoleMenuExample example);

    int updateByPrimaryKeySelective(PRoleMenu record);
}