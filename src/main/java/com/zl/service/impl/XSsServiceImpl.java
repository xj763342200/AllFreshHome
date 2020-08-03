package com.zl.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;
import com.zl.domain.XSs;
import com.zl.mapper.XSsMapper;
import com.zl.service.XSsService;
@Service
public class XSsServiceImpl implements XSsService{

    @Resource
    private XSsMapper xSsMapper;

    @Override
    public int deleteByPrimaryKey(BigDecimal sId) {
        return xSsMapper.deleteByPrimaryKey(sId);
    }

    @Override
    public int insert(XSs record) {
        return xSsMapper.insert(record);
    }

    @Override
    public int insertSelective(XSs record) {
        return xSsMapper.insertSelective(record);
    }

    @Override
    public XSs selectByPrimaryKey(BigDecimal sId) {
        return xSsMapper.selectByPrimaryKey(sId);
    }

    @Override
    public int updateByPrimaryKeySelective(XSs record) {
        return xSsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(XSs record) {
        return xSsMapper.updateByPrimaryKey(record);
    }

}
