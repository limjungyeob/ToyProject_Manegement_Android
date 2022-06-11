package com.example.toyproject_management_v1;

import androidx.annotation.Nullable;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    //서버 URL 설정(PHP파일 연동)
    final static private String URL = "https://ehhdtks1526.cafe24.com/Register.php";
    private Map<String,String> map;
    public RegisterRequest(String userID, String userPassword,
                           String userName, int userAge, Response.Listener<String> listener){
        super(Method.POST,URL,listener,null);   //POST방식으로 통신
        map = new HashMap<>(); //해시맵으로 초기화
        map.put("userID",userID);
        map.put("userPassword",userPassword);
        map.put("userName",userName);
        map.put("userAge",userAge+"");//userAge는 int형이기 때문에 문자열을 더해 문자열로 변환

    }
    @Override
    public Map<String,String> getParams(){
        return map;
    }
}
