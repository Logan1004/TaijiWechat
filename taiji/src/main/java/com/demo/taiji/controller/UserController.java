package com.demo.taiji.controller;

import com.demo.taiji.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component
@Controller
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("GetUserByWechatId")
    @ResponseBody
    public int GetUserByWechatId(@RequestParam("username") String name){
        return service.GetUseridBywechatid(name);
    }

    @RequestMapping("AddUser")
    @ResponseBody
    public int AddUser(@RequestParam("username") String name){
        return service.AddUser(name);
    }


}
