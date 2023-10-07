package com.example.demo.service;

import com.example.demo.entity.t_user_0;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface userInterface {
    t_user_0 login(t_user_0 user);
    List<t_user_0> selrctAA();
}
