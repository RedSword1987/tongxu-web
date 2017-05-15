package com.tongxuweb.service;

import com.tongxuweb.domain.entity.MainOrders;
import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.domain.entity.common.PaginationResult;

import java.util.Map;

/**
 */
public interface TbService {
    PaginationResult tbStaticPage(Pagination pagination);

    PaginationResult tbStaticSize(Pagination pagination);

    PaginationResult tbStaticItem(Pagination pagination);

    PaginationResult tbOrderPage(Pagination pagination);

    PaginationResult tbOrderWuliuPage(Pagination pagination);

    PaginationResult tbOrderMoneyPage(Pagination pagination);

    void refreshStatic(String beginDate, String endDate);


}
