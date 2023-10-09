package com.example.demo.controller;

import com.example.demo.entity.passenger;
import com.example.demo.service.passengerInterface;
import com.example.demo.utils.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * 类名：乘车人信息类
 * 创建人：王邦城
 * 编写人：王邦城
 * 查询乘车人方法:select
 * 添加乘车人方法：add
 * 修改乘车人信息方法：update
 * 移除乘车人方法：remove
 * 版本1.0
 * **/
@CrossOrigin

@RestController
@RequestMapping("/passenger")
public class userController {
    @Autowired
    com.example.demo.service.passengerInterface passengerInterface;

    @GetMapping("select")
    @CrossOrigin
    public APIResponse<passenger> select(@RequestHeader("Authorization") String token,String username) {

        try {
            if (!ObjectUtils.isEmpty(passengerInterface.select(username))) {
                APIResponse<passenger> response = APIResponse.successResponse(passengerInterface.select(username));

             return response;
            }
        } catch (Exception e) {
            APIResponse<passenger> err=APIResponse.errorResponse(404,e.getMessage());

            return err;
        }

        APIResponse<passenger> err1=APIResponse.errorResponse(404,"错误异常");
        return err1;
    }
    @PostMapping("/add")
    public APIResponse<String> add(@RequestHeader("Authorization") String token, @RequestBody passenger passenger){

        try {
            if (passengerInterface.insertpassenger(passenger)){
                APIResponse<String> response=APIResponse.successResponse1();
return response;
            }
        }catch (Exception e){
return APIResponse.errorResponse(1,e.getMessage());
        }
        return APIResponse.errorResponse(2,"错误异常");
    }

    @PostMapping("/update")
    public APIResponse<String> updata(@RequestHeader("Authorization") String token,@RequestBody passenger passenger){
        try {


            if (passengerInterface.update(passenger)){
               return APIResponse.successResponse1();
            }
        }catch (Exception e){
            APIResponse.errorResponse(1,e.getMessage());

        }
        return APIResponse.errorResponse(2,"错误异常");
    }
@PostMapping("/remove")
    public APIResponse<String> remove(@RequestHeader("Authorization")String token,@RequestBody passenger passenger){
        try {
            if (passengerInterface.remove(passenger)){
                return APIResponse.successResponse1();
            }
        }catch (Exception e){
            return  APIResponse.errorResponse(1,e.getMessage());
        }
        return APIResponse.errorResponse(2,"错误异常");
}
}
