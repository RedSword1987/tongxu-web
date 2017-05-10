package com.tongxuweb.dao;

import com.tongxuweb.domain.generate.TbStatic;
import com.tongxuweb.mapper.generate.TbStaticMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by higgs on 17/5/8.
 */
public interface TbStaticDao extends TbStaticMapper {
    @Select("select * from tb_static a where a.seller_id in(${sellerIds}) and a.date between #{beginDate} and #{endDate}")
    @ResultType(TbStatic.class)
    List<TbStatic> listBySellerAndDate(@Param("sellerIds") String sellerIds,
                                       @Param("beginDate") String beginDate,
                                       @Param("endDate") String endDate);
}
