package com.demo.taiji.controller;

import com.demo.taiji.models.Jibengong;
import com.demo.taiji.service.JibengongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Component
@Controller
public class JibengongController {
    @Autowired
    private JibengongService jibengongService;

    @RequestMapping("GetAllJibengong")
    @ResponseBody
    public List<Jibengong> GetAllJibengong(){
        return jibengongService.GetAllJibengong();
    }

//    @RequestMapping("AddJibengong")
//    @ResponseBody
//    public Boolean AddJibengong(@RequestParam("Jibengong") String content){
//        return jibengongService.AddJiBenGong(content);
//    }

}
