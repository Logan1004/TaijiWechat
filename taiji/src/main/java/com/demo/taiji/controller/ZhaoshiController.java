package com.demo.taiji.controller;

import com.demo.taiji.models.Zhaoshi;
import com.demo.taiji.service.ZhaoshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Component
@Controller
public class ZhaoshiController {
    @Autowired
    private ZhaoshiService zhaoshiService;
    @RequestMapping("GetAllZhaoshi")
    @ResponseBody
    public List<Zhaoshi> GetAllUnit(){
        return zhaoshiService.GetAllZhaoshi();
    }
//
//    @RequestMapping("AddZhaoshi")
//    @ResponseBody
//    public Boolean AddJibengong(@RequestParam("zhaoshi") String content){
//        return zhaoshiService.AddZhaoshi(content);
//    }
}

