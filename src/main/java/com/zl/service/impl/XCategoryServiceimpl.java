package com.zl.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zl.mapper.XCategoryMapper;
import com.zl.domain.XCategory;
@Service
public class XCategoryServiceimpl {

    @Resource
    private XCategoryMapper xCategoryMapper;

    
    public int deleteByPrimaryKey(Short categoryId) {
        return xCategoryMapper.deleteByPrimaryKey(categoryId);
    }

    
    public int insert(XCategory record) {
        return xCategoryMapper.insert(record);
    }

    
    public int insertSelective(XCategory record) {
        return xCategoryMapper.insertSelective(record);
    }

    
    public XCategory selectByPrimaryKey(Short categoryId) {
        return xCategoryMapper.selectByPrimaryKey(categoryId);
    }

    
    public int updateByPrimaryKeySelective(XCategory record) {
        return xCategoryMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(XCategory record) {
        return xCategoryMapper.updateByPrimaryKey(record);
    }

}
