package com.mina.Entity;

public class car {
    Integer car_id;
    String car_type;
    String sub_id;
    Integer att_id;
    attribute attribute;
//
//    public car(Integer car_id) {
//        this.car_id = car_id;
//    }


    public car() {
    }

    public car(Integer car_id, String car_type, String sub_id, Integer att_id) {
        this.car_id = car_id;
        this.car_type = car_type;
        this.sub_id = sub_id;
        this.att_id = att_id;
//        this.attribute = attribute;
    }

    public Integer getCar_id() {
        return car_id;
    }

    public void setCar_id(Integer car_id) {
        this.car_id = car_id;
    }

    public String getCar_type() { return car_type; }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public String getSub_id() {
        return sub_id;
    }

    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }

    public Integer getAtt_id() {
        return att_id;
    }

    public void setAtt_id(Integer att_id) {
        this.att_id = att_id;
    }

    public attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(com.mina.Entity.attribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "car{" +
                "car_id=" + car_id +
                ", car_type='" + car_type + '\'' +
                ", sub_id='" + sub_id + '\'' +
                ", att_id=" + att_id +
//                ", attribute=" + attribute +
                '}';
    }
//    public void toJsonTest() {
//        Map<String, String> foo = new HashMap<>();
//        foo.put("car_id", car_id);
//        foo.put("car_type", car_type );
//        foo.put("sub_id", sub_id);
//        foo.put("att_id", att_id);
//
//
//        String json = JsonUtils.toJson(foo);
//        assertEquals("{\n  \"name\": \"hello\",\n  \"value\": \"world\"\n}", json);
//    }

}