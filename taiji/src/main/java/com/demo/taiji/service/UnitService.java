package com.demo.taiji.service;

import com.demo.taiji.dao.UnitMapper;
import com.demo.taiji.models.Unit;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class UnitService {
    @Autowired
    private UnitMapper unitMapper;

//    public Boolean AddUnit(String unit){
//        return unitMapper.insertByName(unit);
//    }

    public List<Unit> GetAllUnit(){
        return unitMapper.getAllUnit();
    }

}
