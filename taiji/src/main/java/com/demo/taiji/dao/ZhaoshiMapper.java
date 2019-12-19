package com.demo.taiji.dao;

import com.demo.taiji.models.Unit;
import com.demo.taiji.models.Zhaoshi;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ZhaoshiMapper {

    @Select("SELECT "//    @Select({"SELECT "
            + " * "
            + " FROM "
            + " ZhaoShi")
    List<Zhaoshi> getAllZhaoshi();
}