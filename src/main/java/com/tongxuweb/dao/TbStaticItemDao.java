package com.tongxuweb.dao;

import com.tongxuweb.domain.generate.TbStaticItem;
import com.tongxuweb.mapper.generate.TbStaticItemMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 */
public interface TbStaticItemDao extends TbStaticItemMapper {
    @Select("select * from tb_static_item a where a.seller_id in(${sellerIds}) and a.date=#{date} order by item_num desc,item_name limit 8 ")
    @ResultType(TbStaticItem.class)
    List<TbStaticItem> selectTopOrderByNum(@Param("sellerIds") String sellerIds,
                                                  @Param("date") String date);

    List<TbStaticItem> staticData(@Param("date") String date,
                                  @Param("sellerId") String sellerId);
}
