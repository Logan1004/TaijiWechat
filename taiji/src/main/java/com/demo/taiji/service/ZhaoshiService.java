package com.demo.taiji.service;

import com.demo.taiji.dao.ZhaoshiMapper;
import com.demo.taiji.models.Zhaoshi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class ZhaoshiService {
    @Autowired
    private ZhaoshiMapper zhaoshiMapper;

//    public Boolean AddZhaoshi(String zhaoshi){
//        return zhaoshiMapper.insertByName(zhaoshi);
//    }

    public List<Zhaoshi> GetAllZhaoshi(){
        return zhaoshiMapper.getAllZhaoshi();
    }
}

