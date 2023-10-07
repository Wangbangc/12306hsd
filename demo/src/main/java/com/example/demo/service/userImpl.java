package com.example.demo.service;

import com.example.demo.entity.t_user_0;
import com.example.demo.mapper.t_user_0Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userImpl implements userInterface{
    @Autowired
    com.example.demo.mapper.t_user_0Mapper t_user_0Mapper;

    @Override
    public t_user_0 login(t_user_0 user) {
       return t_user_0Mapper.login(user);
    }

    @Override
    public List<t_user_0> selrctAA() {
      return t_user_0Mapper.selrctAA();
    }
}
