package com.zl.service;

import java.math.BigDecimal;
import com.zl.domain.XSs;
public interface XSsService{


    int deleteByPrimaryKey(BigDecimal sId);

    int insert(XSs record);

    int insertSelective(XSs record);

    XSs selectByPrimaryKey(BigDecimal sId);

    int updateByPrimaryKeySelective(XSs record);

    int updateByPrimaryKey(XSs record);

}
