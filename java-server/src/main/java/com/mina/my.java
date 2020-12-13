package com.mina;

import com.mina.Entity.attribute;
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
    public Enity enity;
    SqlSession session;
    public void init() throws IOException {

        String resource = "config.xml";

        InputStream inputStream = null;
        inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        session = sqlSessionFactory.openSession();

        enity = session.getMapper(Enity.class);

    }

    public String findCarInfo() {
        car cars = enity.selectcar();     //查询车辆总数
//        System.out.println(cars.toString());
        Map<String, Object> foo = new HashMap<>();
        foo.put("车辆id", cars.getCar_id());
        foo.put("车辆类型id", cars.getCar_type());
        foo.put("私有参数id", cars.getSub_id());
        foo.put("公共参数id", cars.getAtt_id());

        json = JsonUtils.toUpperCaseJson(foo);
//        System.out.println(json);
        return json;
    }

    public String insertCarInfo() {
        car inscar = new car(2020120205, "suv", "2020120205", 2020120205);             //插入
        try {
            enity.insertcar(inscar);
            session.commit();
            return "插入成功";
        }
        catch (Exception a) {
            return "插入失败";
        }
    }

    public String updataCarInfo() {
        car updatacar = new car(2020120205, "suv", "2020120204", 2020120204);             //修改
        try {
            enity.updatacar(updatacar);
            session.commit();
            return "修改成功";
        }
        catch (Exception a) {
            return "修改失败";
        }
    }
    public String deleteCarInfo() {

        try {
            enity.deletecar(2020120205);
            session.commit();
            return "删除成功";
        }
        catch (Exception a) {
            return "删除失败";
        }
    }
//
//            int busA = enity.busNumberA();   //查询bus的总数方法一
//            System.out.println(busA);
//            int busB = enity.busNumberB();  //查询bus的总数方法二
//            System.out.println(busB);

//            CarConditiona = enity.CarCondition();
//            System.out.println(CarConditiona.toString());

//            attribute Subquerya = enity.Subquery();   //子查询
//            System.out.println(Subquerya.toString());


//            car updatacar = new car (2,"suv","2020202020",2);   //  修改
//            enity.updatacar(updatacar);


//            enity.deletecar(3);      //删除字段

//            session.commit();

}



