package com.mina;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import java.util.Map;

@SuppressWarnings(value = "unused")
public class JsonUtils {
    public static <T> T fromJson(String jsonString, Class<T> classOfT) {
        try {
            Gson gson = new GsonBuilder()
                    .serializeNulls()
                    .create();
            return gson.fromJson(jsonString, classOfT);
        } catch (Exception e) {

            return null;
        }
    }

    public static Map<Object, Object> fromJson(String jsonString) {
        Type type = new TypeToken<Map<Object, Object>>() {
        }.getType();

        try {
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(type, new MapTypeAdapter()) // 保持数字格式，不强制转换为float
                    .serializeNulls() // 支持输出NULL
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE) // 首字母大写
                    .create();
            return gson.fromJson(jsonString, type);
        } catch (Exception e) {

            return null;
        }
    }

    public static <T> String toUpperCaseJson(T t) {
        Type type = new TypeToken<Map<Object, Object>>() {
        }.getType();

        try {
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(type, new MapTypeAdapter()) // 保持数字格式，不强制转换为float
                    .serializeNulls() // 支持输出NULL
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)  // 首字母大写
                    .setPrettyPrinting()
                    .create();
            return gson.toJson(t);
        } catch (Exception e) {


            return null;
        }
    }

    public static <T> String toJson(T t) {
        try {
            Gson gson = new GsonBuilder()
                    .serializeNulls() // 支持输出NULL
                    .setPrettyPrinting()
                    .create();
            return gson.toJson(t);
        } catch (Exception e) {

            return null;
        }
    }
}