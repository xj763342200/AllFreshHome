package com.zl.mapper;

import com.zl.domain.XProduct;

public interface XProductMapper {
    int deleteByPrimaryKey(Short proId);

    int insert(XProduct record);

    int insertSelective(XProduct record);

    XProduct selectByPrimaryKey(Short proId);

    int updateByPrimaryKeySelective(XProduct record);

    int updateByPrimaryKey(XProduct record);
}