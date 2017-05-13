package com.tongxuweb.service;

import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.domain.generate.TbSeller;
import com.tongxuweb.domain.generate.TbStaticItem;

import java.util.List;
import java.util.Map;

/**
 * Created by higgs on 17/5/8.
 */
public interface TaskTypeService {

    PaginationResult taskTypePage(Pagination pagination);

    PaginationResult taskRunPage(Pagination pagination, String code);

}
