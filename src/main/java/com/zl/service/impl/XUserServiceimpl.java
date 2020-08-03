package com.zl.service.impl;

import com.zl.service.XUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zl.mapper.XUserMapper;
import com.zl.domain.XUser;
@Service
public class XUserServiceimpl implements XUserService {

    @Resource
    private XUserMapper xUserMapper;

    
    public int deleteByPrimaryKey(Short userId) {
        return xUserMapper.deleteByPrimaryKey(userId);
    }

    
    public int insert(XUser record) {
        System.out.println(xUserMapper);
        return xUserMapper.insert(record);
    }

    
    public int insertSelective(XUser record) {
        return xUserMapper.insertSelective(record);
    }

    
    public XUser selectByPrimaryKey(Short userId) {
        return xUserMapper.selectByPrimaryKey(userId);
    }

    
    public int updateByPrimaryKeySelective(XUser record) {
        return xUserMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(XUser record) {
        return xUserMapper.updateByPrimaryKey(record);
    }

}
