package com.demo.taiji.dao;

import com.demo.taiji.models.Checktable;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface ChecktableMapper {

    @Select({"SELECT "//    @Select({"SELECT "
            + " * "
            + " FROM "
            + " CheckTable c "
            + " WHERE "
            + " c.userid = #{id} order by date desc"})
    List<Checktable> getRecordByUserId(int id);

    @Select({"SELECT "//    @Select({"SELECT "
            + " * "
            + " FROM "
            + " CheckTable c "
            + " WHERE "
            + " c.userid = #{userid}"
            + " and c.year = #{year} and c.program = #(content} order by date desc"})
    List<Checktable> getYearRecordByUserId(int userid,int year,String content);

    @Select({"SELECT "//    @Select({"SELECT "
            + " * "
            + " FROM "
            + " CheckTable c "
            + " WHERE "
            + " c.userid = #{userid} and c.month = #{month} "
            + " and c.year = #{year} and c.program = #(content} order by date desc"})
    List<Checktable> getMonthRecordByUserId(int userid,int month,int year,String content);

    @Insert({"INSERT INTO CheckTable Values(NULL,#{date},#{month},#{year},#{number},#{program}," +
            "#{unit},#{userid})"})
    int insertRecord(Date date,int month, int year, int number, String program, String unit,int userid);

}