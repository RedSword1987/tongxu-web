package com.tongxuweb.dao;

import com.tongxuweb.domain.create.StaticSizeResult;
import com.tongxuweb.domain.generate.TbStaticSize;
import com.tongxuweb.mapper.generate.TbStaticSizeMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by higgs on 17/5/8.
 */
public interface TbStaticSizeDao extends TbStaticSizeMapper {

    TbStaticSize sumSize(@Param("sellerIds") String sellerIds,
                         @Param("beginDate") String beginDate,
                         @Param("endDate") String endDate);

    List<StaticSizeResult> staticData(@Param("date") String date,
                                      @Param("sellerId") String sellerId);
}
