package com.zl;

import com.zl.domain.XUser;
import com.zl.mapper.XUserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author java43.熊佳
 * @date 2020/7/31 11:29
 * @Description
 */

public class MyTest {
    @Autowired
    private XUserMapper xUserMapper;

    @Test
    public void test01(){
        XUser xUser = new XUser();
        xUser.setUsername("zhangsan");
        xUser.setUserpwd("123");
        xUser.setRealname("张三");
        System.out.println(xUserMapper);
        /*int flag = xUserMapper.insert(xUser);
        System.out.println(flag);*/
    }

}
