package com.tongxuweb.dao;

import com.tongxuweb.domain.generate.TbStaticSize;
import com.tongxuweb.mapper.generate.TbStaticSizeMapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by higgs on 17/5/8.
 */
public interface TbStaticSizeDao extends TbStaticSizeMapper {

    TbStaticSize sumSize(@Param("sellerIds") String sellerIds,
                         @Param("beginDate") String beginDate,
                         @Param("endDate") String endDate);
}
