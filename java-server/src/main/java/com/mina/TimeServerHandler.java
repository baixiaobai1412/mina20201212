package com.mina;

import java.util.Date;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class TimeServerHandler extends IoHandlerAdapter
{
    @Override
    public void exceptionCaught( IoSession session, Throwable cause ) throws Exception
    {
        cause.printStackTrace();
    }

    @Override
    public void messageReceived( IoSession session, Object message ) throws Exception
    {
        String str = message.toString();
//        if( str.trim().equalsIgnoreCase("quit") ) {
//            session.close();
//            return;
//        }
        if( str.trim().equalsIgnoreCase("select")){
            my my=new my();
            my.init();
            session.write(my.findCarInfo());
        }

        else if ( str.trim().equalsIgnoreCase("insert")){
            my my=new my();
            my.init();
            session.write(my.insertCarInfo());
        }

        else if ( str.trim().equalsIgnoreCase("update")){
            my my=new my();
            my.init();
            session.write(my.updataCarInfo());

        }

        else if ( str.trim().equalsIgnoreCase("delete")){
            my my=new my();
            my.init();
            session.write(my.deleteCarInfo());
        }

        else{
           session.write("输入错误");
        }
        Date date = new Date();

        System.out.println(date.toString()+"Message :"+str.trim());
    }

    @Override
    public void messageSent(IoSession session, Object message) {
        System.out.println("client send message: " + message.toString());
    }

//    @Override
//    public void sessionIdle( IoSession session, IdleStatus status ) throws Exception
//    {
//        System.out.println( "等待时间: " + session.getIdleCount( status ));
//    }


}