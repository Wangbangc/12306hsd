package com.example.demo.controller;

import com.example.demo.entity.t_user_0;
import com.example.demo.service.userInterface;
import com.example.demo.tool.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
/**
 * 类名：登入类
 * 创建人：王邦城
 * 编写：王邦城
 * login：登入方法
 * register: 注册方法
 * 审核：王邦城
 * **/
@CrossOrigin

@RestController
@RequestMapping("/user")
public class loginController {
    @Autowired
    com.example.demo.service.userInterface userInterface;

    @PostMapping("/login")
    @CrossOrigin
    public Map<String,Object> userLogin(@RequestBody t_user_0 user ){
        Map<String,Object> map=new HashMap<>();
        try {
       if (!ObjectUtils.isEmpty(userInterface.login(user))){
           ResponseData responseData=new ResponseData(userInterface.login(user));
           map=responseData.getResponseData();
         }else {


}
        }catch (Exception e){
            e.getMessage();
        }
return map;
    }

    @PostMapping("/register")
    @CrossOrigin
    public Map<String,Object> Register(@RequestBody t_user_0 user){
        Map<String,Object> map =new HashMap<>();
        System.out.println(user);
        System.out.println(userInterface.insert(user));
        try {
            if (userInterface.insert(user)){
                ResponseData responseData=new ResponseData(user);
                responseData.getResponseData();
            }else {}
        }catch (Exception e){

        }
        return map;
    }
}

