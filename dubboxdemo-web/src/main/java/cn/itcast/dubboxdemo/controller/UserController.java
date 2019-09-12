package cn.itcast.dubboxdemo.controller;

import cn.itcast.dubboxdemo.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    //@Autowired
    @Reference
    private UserService userService;
    @RequestMapping("/showName.do")
    @ResponseBody
    public String showName() {
        return userService.getName();
    }
}
