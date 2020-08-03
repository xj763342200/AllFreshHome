package com.zl.mapper;

import com.zl.domain.XCategory;

public interface XCategoryMapper {
    int deleteByPrimaryKey(Short categoryId);

    int insert(XCategory record);

    int insertSelective(XCategory record);

    XCategory selectByPrimaryKey(Short categoryId);

    int updateByPrimaryKeySelective(XCategory record);

    int updateByPrimaryKey(XCategory record);
}