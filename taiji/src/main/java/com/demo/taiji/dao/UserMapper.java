package com.demo.taiji.dao;

import com.demo.taiji.models.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface UserMapper {

    @Insert({"INSERT INTO User Values(NULL,NULL,#{wechatid},NULL"})
    int insertUser(String wechatid);

    @Select({"SELECT "//    @Select({"SELECT "
            + " * "
            + " FROM "
            + " User u "
            + " WHERE "
            + " u.wechatid = #{wechatid} "})
    User getUserBywechhatId(String wechatid);
}