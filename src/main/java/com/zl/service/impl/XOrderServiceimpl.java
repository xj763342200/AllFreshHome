package com.zl.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zl.mapper.XOrderMapper;
import com.zl.domain.XOrder;
@Service
public class XOrderServiceimpl {

    @Resource
    private XOrderMapper xOrderMapper;

    
    public int deleteByPrimaryKey(Long orderId) {
        return xOrderMapper.deleteByPrimaryKey(orderId);
    }

    
    public int insert(XOrder record) {
        return xOrderMapper.insert(record);
    }

    
    public int insertSelective(XOrder record) {
        return xOrderMapper.insertSelective(record);
    }

    
    public XOrder selectByPrimaryKey(Long orderId) {
        return xOrderMapper.selectByPrimaryKey(orderId);
    }

    
    public int updateByPrimaryKeySelective(XOrder record) {
        return xOrderMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(XOrder record) {
        return xOrderMapper.updateByPrimaryKey(record);
    }

}
