package com.zl.mapper;

import com.zl.domain.XSs;
import java.math.BigDecimal;

public interface XSsMapper {
    int deleteByPrimaryKey(BigDecimal sId);

    int insert(XSs record);

    int insertSelective(XSs record);

    XSs selectByPrimaryKey(BigDecimal sId);

    int updateByPrimaryKeySelective(XSs record);

    int updateByPrimaryKey(XSs record);
}