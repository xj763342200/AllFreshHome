package com.zl.test;

import com.zl.domain.XUser;
import com.zl.mapper.XUserMapper;
import com.zl.service.impl.XUserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author java43.熊佳
 * @date 2020/7/31 11:56
 * @Description
 */
@Component
public class MyTset {
    private static XUserServiceimpl xUserMapper;

    @Autowired
    public MyTset(XUserServiceimpl xUserMapper){
        this.xUserMapper = xUserMapper;
    }



    public static void main(String[] args) {
        XUser xUser = new XUser();
        xUser.setUsername("zhangsan");
        xUser.setUserpwd("123");
        xUser.setRealname("张三");
        /*ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:app.xml");
        xUserMapper = ac.getBean(XUserMapper.class);*/
        XUserServiceimpl xUserServiceimpl = new XUserServiceimpl();
        System.out.println(xUserServiceimpl);
        int flag = xUserServiceimpl.insert(xUser);
        System.out.println(flag);
        /*int flag = xUserMapper.insert(xUser);
        System.out.println(flag);*/
    }

}
