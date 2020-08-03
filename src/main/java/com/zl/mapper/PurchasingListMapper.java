package com.zl.mapper;

import com.zl.domain.PurchasingList;

public interface PurchasingListMapper {
    int deleteByPrimaryKey(Long purId);

    int insert(PurchasingList record);

    int insertSelective(PurchasingList record);

    PurchasingList selectByPrimaryKey(Long purId);

    int updateByPrimaryKeySelective(PurchasingList record);

    int updateByPrimaryKey(PurchasingList record);
}