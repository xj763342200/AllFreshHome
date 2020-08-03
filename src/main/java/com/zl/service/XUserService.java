package com.zl.service;

import com.zl.domain.XUser;

/**
 * @author java43.熊佳
 * @date 2020/7/31 14:56
 * @Description
 */
public interface XUserService {
    int deleteByPrimaryKey(Short userId);

    int insert(XUser record);

    int insertSelective(XUser record);

    XUser selectByPrimaryKey(Short userId);

    int updateByPrimaryKeySelective(XUser record);

    int updateByPrimaryKey(XUser record);


}
