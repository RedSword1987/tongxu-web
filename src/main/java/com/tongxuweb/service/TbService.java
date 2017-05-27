package com.tongxuweb.service;

import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.domain.generate.TbItem;
import com.tongxuweb.domain.generate.TbSeller;

import java.util.List;

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

    PaginationResult tbSellerPage(Pagination pagination);

    PaginationResult tbItemPage(Pagination pagination);

    int tbItemImport();

    int tbSellerImport();

    int tbItemRefreshPrice();

    void tbSellerAdd(TbSeller tbSeller);

    void tbSellerDelete(List<Long> ids);

    void tbSellerUpdate(TbSeller tbSeller);

    void tbItemAdd(TbItem tbItem);

    void tbItemDelete(List<Long> ids);

    void tbItemUpdate(TbItem tbItem);

}
