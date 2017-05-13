package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.OrderMoney;
import com.tongxuweb.domain.generate.OrderMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMoneyMapper {
    int countByExample(OrderMoneyExample example);

    int deleteByExample(OrderMoneyExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderMoney record);

    List<OrderMoney> selectByExample(OrderMoneyExample example);

    OrderMoney selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderMoney record, @Param("example") OrderMoneyExample example);

    int updateByPrimaryKeySelective(OrderMoney record);
}