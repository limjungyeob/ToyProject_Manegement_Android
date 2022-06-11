package com.example.toyproject_management_v1;

import androidx.annotation.Nullable;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class DeleteRequest extends StringRequest {
    final static private String URL = "https://ehhdtks1526.cafe24.com/Delete.php";
    private Map<String,String> map;

    public DeleteRequest(String userID,Response.Listener<String> listener){
        super(Request.Method.POST,URL,listener,null);
        map = new HashMap<>();
        map.put("userID",userID);
    }
    @Override
    public Map<String,String> getParams(){
        return map;
    }
}
