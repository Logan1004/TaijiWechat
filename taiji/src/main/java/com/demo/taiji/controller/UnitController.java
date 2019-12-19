package com.demo.taiji.controller;

import com.demo.taiji.models.Jibengong;
import com.demo.taiji.models.Unit;
import com.demo.taiji.service.UnitService;
import com.demo.taiji.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Component
@Controller
public class UnitController {
    @Autowired
    private UnitService unitService;

    @RequestMapping("GetAllUnit")
    @ResponseBody
    public List<Unit> GetAllUnit(){
        return unitService.GetAllUnit();
    }

//    @RequestMapping("AddUnit")
//    @ResponseBody
//    public Boolean AddJibengong(@RequestParam("unit") String content){
//        return unitService.AddUnit(content);
//    }
}
