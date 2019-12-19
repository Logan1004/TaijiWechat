package com.demo.taiji.service;

import com.demo.taiji.dao.JibengongMapper;
import com.demo.taiji.models.Jibengong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service

public class JibengongService {
    @Autowired
    private JibengongMapper jibengongMapper;

//    public Boolean AddJiBenGong(String jibengong){
//        return jibengongMapper.insertByName(jibengong);
//    }

    public List<Jibengong> GetAllJibengong(){
        return jibengongMapper.getAllJibengong();
    }
}
