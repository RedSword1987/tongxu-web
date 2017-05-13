package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.TbSeller;
import com.tongxuweb.domain.generate.TbSellerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSellerMapper {
    int countByExample(TbSellerExample example);

    int deleteByExample(TbSellerExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(TbSeller record);

    List<TbSeller> selectByExample(TbSellerExample example);

    TbSeller selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSeller record, @Param("example") TbSellerExample example);

    int updateByPrimaryKeySelective(TbSeller record);
}