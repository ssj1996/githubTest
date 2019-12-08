package com.kele.service;


import com.kele.userMapper.UserMapper;
import domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/11/28.
 */
@Service
public class UserService {

   @Autowired
   private UserMapper userMapper;

   public List<User> getUser(){

    return userMapper.getUser();
   }

}
