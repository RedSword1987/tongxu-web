package com.tongxuweb.dao;

import com.tongxuweb.domain.generate.TbStatic;
import com.tongxuweb.mapper.generate.TbStaticMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 */
public interface TbStaticDao extends TbStaticMapper {
    @Select("select * from tb_static a where a.seller_id in(${sellerIds}) and a.date between #{beginDate} and #{endDate}")
    @ResultType(TbStatic.class)
    List<TbStatic> listBySellerAndDate(@Param("sellerIds") String sellerIds,
                                       @Param("beginDate") String beginDate,
                                       @Param("endDate") String endDate);

    Integer staticItemNum(@Param("date") String date, @Param("sellerId") String sellerId);

    Double staticPayinfoActualfee(@Param("date") String date, @Param("sellerId") String sellerId);

    Double staticMoneyFinalMoney(@Param("date") String date, @Param("sellerId") String sellerId);
}
