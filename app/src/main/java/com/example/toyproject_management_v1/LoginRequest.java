package com.example.toyproject_management_v1;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {

    //서버 URL 설정(PHP파일 연동)
    final static private String URL = "https://ehhdtks1526.cafe24.com/Login.php";
    private Map<String,String> map;
    public LoginRequest(String userID, String userPassword,
                        Response.Listener<String> listener){
        super(Method.POST,URL,listener,null);   //POST방식으로 통신
        map = new HashMap<>(); //해시맵으로 초기화
        map.put("userID",userID);
        map.put("userPassword",userPassword);


    }
    @Override
    public Map<String,String> getParams(){
        return map;
    }
}
