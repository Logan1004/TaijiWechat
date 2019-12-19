package com.demo.taiji.dao;

import com.demo.taiji.models.Unit;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UnitMapper {

    @Select("SELECT "//    @Select({"SELECT "
            + " * "
            + " FROM "
            + " Unit")
    List<Unit> getAllUnit();
}