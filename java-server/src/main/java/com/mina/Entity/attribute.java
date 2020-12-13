package com.mina.Entity;

public class attribute {
    Integer att_id;
    String wheel;
    String dynamic_system;
    String exhaust_system;
    Integer seating_capacity;
    String colour;
    String car_door;
    String lighting;
    String Manual_transmission;
    String car_length;
    String Car_width;
    String car_taller;
    String car_number;
    String carriage;
    String speed;


    public attribute() {
    }

    public attribute(Integer att_id, String wheel, String dynamic_system, String exhaust_system, Integer seating_capacity, String colour, String car_door, String lighting, String manual_transmission, String car_length, String car_width, String car_taller, String car_number, String carriage, String speed) {
        this.att_id = att_id;
        this.wheel = wheel;
        this.dynamic_system = dynamic_system;
        this.exhaust_system = exhaust_system;
        this.seating_capacity = seating_capacity;
        this.colour = colour;
        this.car_door = car_door;
        this.lighting = lighting;
        Manual_transmission = manual_transmission;
        this.car_length = car_length;
        Car_width = car_width;
        this.car_taller = car_taller;
        this.car_number = car_number;
        this.carriage = carriage;
        this.speed = speed;
    }



    public Integer getAtt_id() {
        return att_id;
    }

    public void setAtt_id(Integer att_id) {
        this.att_id = att_id;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getDynamic_system() {
        return dynamic_system;
    }

    public void setDynamic_system(String dynamic_system) {
        this.dynamic_system = dynamic_system;
    }

    public String getExhaust_system() {
        return exhaust_system;
    }

    public void setExhaust_system(String exhaust_system) {
        this.exhaust_system = exhaust_system;
    }

    public Integer getSeating_capacity() {
        return seating_capacity;
    }

    public void setSeating_capacity(Integer seating_capacity) {
        this.seating_capacity = seating_capacity;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCar_door() {
        return car_door;
    }

    public void setCar_door(String car_door) {
        this.car_door = car_door;
    }

    public String getLighting() {
        return lighting;
    }

    public void setLighting(String lighting) {
        this.lighting = lighting;
    }

    public String getManual_transmission() {
        return Manual_transmission;
    }

    public void setManual_transmission(String manual_transmission) {
        Manual_transmission = manual_transmission;
    }

    public String getCar_length() {
        return car_length;
    }

    public void setCar_length(String car_length) {
        this.car_length = car_length;
    }

    public String getCar_width() {
        return Car_width;
    }

    public void setCar_width(String car_width) {
        Car_width = car_width;
    }

    public String getCar_taller() {
        return car_taller;
    }

    public void setCar_taller(String car_taller) {
        this.car_taller = car_taller;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public String getCarriage() {
        return carriage;
    }

    public void setCarriage(String carriage) {
        this.carriage = carriage;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "attribute{" +
                "att_id=" + att_id +
                ", wheel='" + wheel + '\'' +
                ", dynamic_system='" + dynamic_system + '\'' +
                ", exhaust_system='" + exhaust_system + '\'' +
                ", seating_capacity=" + seating_capacity +
                ", colour='" + colour + '\'' +
                ", car_door='" + car_door + '\'' +
                ", lighting='" + lighting + '\'' +
                ", Manual_transmission='" + Manual_transmission + '\'' +
                ", car_length='" + car_length + '\'' +
                ", Car_width='" + Car_width + '\'' +
                ", car_taller='" + car_taller + '\'' +
                ", car_number='" + car_number + '\'' +
                ", carriage='" + carriage + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }

}
