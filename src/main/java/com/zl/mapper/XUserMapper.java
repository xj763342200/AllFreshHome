package com.zl.mapper;

import com.zl.domain.XUser;

public interface XUserMapper {
    int deleteByPrimaryKey(Short userId);

    int insert(XUser record);

    int insertSelective(XUser record);

    XUser selectByPrimaryKey(Short userId);

    int updateByPrimaryKeySelective(XUser record);

    int updateByPrimaryKey(XUser record);
}