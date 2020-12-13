package com.mina.ParaMapper;

import com.mina.Entity.attribute;
import com.mina.Entity.car;

public interface Enity {
    car selectcar(); //增
    void insertcar(car tmp); //插
    void updatacar(car tmp); //改
    void deletecar(int car_id); //删
}
