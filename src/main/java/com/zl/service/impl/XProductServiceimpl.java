package com.zl.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zl.domain.XProduct;
import com.zl.mapper.XProductMapper;
@Service
public class XProductServiceimpl {

    @Resource
    private XProductMapper xProductMapper;

    
    public int deleteByPrimaryKey(Short proId) {
        return xProductMapper.deleteByPrimaryKey(proId);
    }

    
    public int insert(XProduct record) {
        return xProductMapper.insert(record);
    }

    
    public int insertSelective(XProduct record) {
        return xProductMapper.insertSelective(record);
    }

    
    public XProduct selectByPrimaryKey(Short proId) {
        return xProductMapper.selectByPrimaryKey(proId);
    }

    
    public int updateByPrimaryKeySelective(XProduct record) {
        return xProductMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(XProduct record) {
        return xProductMapper.updateByPrimaryKey(record);
    }

}
