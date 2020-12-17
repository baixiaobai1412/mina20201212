package com.mina;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;


import java.util.Date;

public class TimeServerHandler extends IoHandlerAdapter {
    @Override
    public void exceptionCaught(IoSession session, Throwable cause) {
        cause.printStackTrace();
    }
    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
            String str = message.toString();
            my my = new my();
            my.init();
        if (str.equalsIgnoreCase("select")) {
            session.write(my.findCarInfo());
        }
        else if (str.equalsIgnoreCase("insert")) {
            session.write(my.insertCarInfo());
        }
        else if (str.equalsIgnoreCase("update")) {
            session.write(my.updataCarInfo());
        }
        else if (str.equalsIgnoreCase("delete")) {
            session.write(my.deleteCarInfo());
        }
        else {
            session.write(my.errCarInfo());
        }
            Date date = new Date();
            System.out.println(date.toString() + "Message :" + str.trim());
        }

    public void messageSent (IoSession session, Object message){
            System.out.println("client send message: " + message.toString());
        }

 }


