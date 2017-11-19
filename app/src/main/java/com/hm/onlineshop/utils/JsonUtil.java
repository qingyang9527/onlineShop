package com.hm.onlineshop.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
 * Created by H&M on 2017/8/11 14:25:39
 */

public class JsonUtil {

    private static Gson gson= new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private static Gson getGson(){
        return gson;
    }

    /**
     * json转成对象
     * @param json
     * @param clz
     * @param <T>
     * @return
     */
    private static <T> T fromJson(String json,Class<T> clz){
        return gson.fromJson(json,clz);
    }

    /**
     * json转成集合
     * @param json
     * @param type
     * @param <T>
     * @return
     */
    private static <T> T fromJson(String json, Type type){
        return gson.fromJson(json,type);
    }

    /**
     * 对象转成字符串
     * @param object
     * @return
     */
    private static String toJson(Object object){
        return gson.toJson(object);
    }

}
