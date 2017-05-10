package com.tongxuweb.service;

import com.tongxuweb.domain.generate.TbSeller;
import com.tongxuweb.domain.generate.TbStaticItem;

import java.util.List;
import java.util.Map;

/**
 * Created by higgs on 17/5/8.
 */
public interface TbStaticService {
    Map<String, List<Map<String, Object>>> getAllLines(List<TbSeller> li);

    List<Map<String, Object>> getIndexPieList(List<TbSeller> li);

    List<TbStaticItem> getIndexTableList(List<TbSeller> li);

}
