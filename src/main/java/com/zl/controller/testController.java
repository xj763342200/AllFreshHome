package com.zl.controller;

import com.zl.domain.XUser;
import com.zl.service.XUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

/**
 * @author java43.熊佳
 * @date 2020/7/31 15:13
 * @Description
 */
@Controller
public class testController {
    @Autowired
    private XUserService xUserService;

    @GetMapping("/test")
    public String login(Model model) throws IOException {
        XUser xUser = new XUser();
        xUser.setUsername("zhangsan");
        xUser.setUserpwd("123");
        xUser.setRealname("张三");
        int flag = xUserService.insert(xUser);
        model.addAttribute("flag",flag);
        return "test";
    }
}
