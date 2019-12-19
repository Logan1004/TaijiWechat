package com.demo.taiji.dao;

import com.demo.taiji.models.Jibengong;
import org.apache.ibatis.annotations.Select;

import javax.swing.*;
import java.util.List;

public interface JibengongMapper {

    @Select("SELECT "//    @Select({"SELECT "
            + " * "
            + " FROM "
            + " JiBenGong")
    List<Jibengong> getAllJibengong();
}