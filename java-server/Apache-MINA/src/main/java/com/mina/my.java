package com.mina;

import com.mina.Entity.car;
import com.mina.ParaMapper.Enity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class my {
    public String json;
    public String data_json;
    public Enity enity;
    SqlSession session;
    public void init() throws IOException {
        String resource = "config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession();
        enity = session.getMapper(Enity.class);

    }

    public String findCarInfo() {
        car cars = enity.carNumber();     //查询车辆总数
        try {

            Map<String, Object> data = new HashMap<>();
            data.put("车辆id", cars.getCar_id());
            data.put("车辆类型id", cars.getCar_type());
            data.put("私有参数id", cars.getSub_id());
            data.put("公共参数id", cars.getAtt_id());
            data_json = JsonUtils.toUpperCaseJson(data);


            Map<String, Object> foo = new HashMap<>();
            foo.put("code", "200");
            foo.put("data",data_json);
            json = JsonUtils.toUpperCaseJson(foo);
            return json;
        }
        catch (Exception a) {
            Map<String, String> foo = new HashMap<>();
            foo.put("code", "501");
            foo.put("data",null);
            json = JsonUtils.toUpperCaseJson(foo);
            return json;
        }
    }

    public String insertCarInfo() {
        car inscar = new car(2020120205, "suv", "2020120205", 2020120205);             //插入
        try {
            enity.insertcar(inscar);
            session.commit();
            Map<String, String> foo = new HashMap<>();
            foo.put("code", "200");
            foo.put("data",null);
            json = JsonUtils.toUpperCaseJson(foo);
            return json;
        }
        catch (Exception a) {
            Map<String, String> foo = new HashMap<>();
            foo.put("code", "502");
            foo.put("data",null);
            json = JsonUtils.toUpperCaseJson(foo);
            return json;
        }
    }

    public String updataCarInfo() {
        car updatacar = new car(2020120205, "suv", "2020120204", 2020120204);             //修改
        try {
            enity.updatacar(updatacar);
            session.commit();
            Map<String, String> foo = new HashMap<>();
            foo.put("code", "200");
            foo.put("data",null);
            json = JsonUtils.toUpperCaseJson(foo);
            return json;
        }
        catch (Exception a) {
            Map<String, String> foo = new HashMap<>();
            foo.put("code", "503");
            foo.put("data",null);
            json = JsonUtils.toUpperCaseJson(foo);
            return json;
        }
    }

    public String deleteCarInfo() {

        try {
            enity.deletecar(2020120205);
            session.commit();
            Map<String, String> foo = new HashMap<>();
            foo.put("code", "200");
            foo.put("data",null);
            json = JsonUtils.toUpperCaseJson(foo);
            return json;
        }
        catch (Exception a) {
            Map<String, String> foo = new HashMap<>();
            foo.put("code", "504");
            foo.put("data",null);
            json = JsonUtils.toUpperCaseJson(foo);
            return json;
        }
    }

    public String errCarInfo() {
        Map<String, String> foo = new HashMap<>();
        foo.put("code", "404");
        foo.put("data",null);
        json = JsonUtils.toUpperCaseJson(foo);
        return json;

    }

}




