package com.demo.taiji.controller;

import com.demo.taiji.models.Checktable;
import com.demo.taiji.service.RecordService;
import com.demo.taiji.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Component
@Controller
public class RecordController {
    @Autowired
    private UserService userService;

    @Autowired
    private RecordService recordService;

    @RequestMapping("GetRecordByUserId")
    @ResponseBody
    public List<Checktable> GetRecordByUserId(@RequestParam("username") String username){
        int userid = userService.GetUseridBywechatid(username);
        return recordService.GetRecordByUserId(userid);
    }

    @RequestMapping("GetHistoryRecord")
    @ResponseBody
    public HashMap<String,String> GetMaxDateByUserId(@RequestParam("username") String username){
        int userid = userService.GetUseridBywechatid(username);
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("persist",String.valueOf(recordService.GetMaxLoginDate(userid)));
        hashMap.put("totalpractice",String.valueOf(recordService.GetMaxItems(userid)));
        hashMap.put("totaldate",String.valueOf(recordService.GetMaxDate(userid)));
        hashMap.put("latestdate",recordService.GetLatestDate(userid).toString());
        return hashMap;
    }

    @RequestMapping("GetRecord")
    @ResponseBody
    public Checktable GetRecord(@RequestParam("userid") int userid, @RequestParam("month") int month,
                                @RequestParam("year") int year, @RequestParam("content") String content,@RequestParam("unit")String unit){
        return recordService.GetRecord(userid,month,year,content,unit);
    }

    @RequestMapping("InsertRecord")
    @ResponseBody
    public int InsertRecord(@RequestParam("username") String name, @RequestParam("date") Date date,  @RequestParam("program") String program,
                            @RequestParam("number") int number, @RequestParam("unit") String unit){
        System.out.println(name+ " "+date+" "+program+" "+number+" "+unit);
        return recordService.InsertRecord(name,date,program,number,unit);

    }


}
