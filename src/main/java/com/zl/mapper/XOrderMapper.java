package com.zl.mapper;

import com.zl.domain.XOrder;

public interface XOrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(XOrder record);

    int insertSelective(XOrder record);

    XOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(XOrder record);

    int updateByPrimaryKey(XOrder record);
}