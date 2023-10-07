package com.example.demo.tool;
import com.example.demo.entity.t_user_0;

import java.util.HashMap;
import java.util.Map;
public class ResponseData<T> {
    T data;
        private Map<String, Object> responseData;
        public ResponseData(t_user_0 user) {
            responseData = new HashMap<>();
            responseData.put("code", "0");
            responseData.put("message", "null");

            Map<String, String> data = new HashMap<>();
            data.put("username", user.getUsername());
            data.put("realName", user.getRealName());
            data.put("accessToken", user.getPassword());

            responseData.put("data", data);
            responseData.put("requestId", "null");
            responseData.put("success", true);
        }

        public Map<String, Object> getResponseData() {
            return responseData;
        }
//    public static void main(String[] args) {
//        String username = "mocheng";
//        String realName = "138501";
//        String accessToken = "adadadadadasdadasxcasf";
//
//        ResponseData responseData = new ResponseData(username, realName, accessToken);
//        Map<String, Object> responseMap = responseData.getResponseData();
//        System.out.println(responseMap);
//    }
      
    }

