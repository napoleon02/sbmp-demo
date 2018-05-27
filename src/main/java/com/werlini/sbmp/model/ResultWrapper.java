package com.werlini.sbmp.model;

import java.util.HashMap;
import java.util.Map;

public class ResultWrapper {

    public static Map<String, Object> result(Integer code, String message, Object data){
        Map<String, Object> map = new HashMap<>();
        map.put("code", code);
        map.put("message", message);
        map.put("body", data);
        return map;
    }
}
