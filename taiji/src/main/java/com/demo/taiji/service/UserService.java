package com.demo.taiji.service;

import com.demo.taiji.dao.UserMapper;
import com.demo.taiji.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class UserService {
    @Autowired
    private UserMapper userRepo;

     public int GetUseridBywechatid(String name) {
         User user = userRepo.getUserBywechhatId(name);
         if (user == null) {
             return -1;
         } else{
             return userRepo.getUserBywechhatId(name).getUserid();
         }
     }

     public int AddUser(String name){
         if (GetUseridBywechatid(name)==-1){
             return userRepo.insertUser(name);
         }else{
             return 1;
         }

     }


}
