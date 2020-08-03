package com.zl.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zl.domain.PurchasingList;
import com.zl.mapper.PurchasingListMapper;
@Service
public class PurchasingListServiceimpl {

    @Resource
    private PurchasingListMapper purchasingListMapper;

    
    public int deleteByPrimaryKey(Long purId) {
        return purchasingListMapper.deleteByPrimaryKey(purId);
    }

    
    public int insert(PurchasingList record) {
        return purchasingListMapper.insert(record);
    }

    
    public int insertSelective(PurchasingList record) {
        return purchasingListMapper.insertSelective(record);
    }

    
    public PurchasingList selectByPrimaryKey(Long purId) {
        return purchasingListMapper.selectByPrimaryKey(purId);
    }

    
    public int updateByPrimaryKeySelective(PurchasingList record) {
        return purchasingListMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(PurchasingList record) {
        return purchasingListMapper.updateByPrimaryKey(record);
    }

}
