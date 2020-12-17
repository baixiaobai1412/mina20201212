package com.mina.ParaMapper;

import com.mina.Entity.attribute;
import com.mina.Entity.car;

public interface Enity {
    car carNumber();
    int busNumberA();
    int busNumberB();
    car CarCondition();
    attribute Subquery();
    void insertcar(car tmp);
    void updatacar(car tmp);
    void deletecar(int car_id);
}
