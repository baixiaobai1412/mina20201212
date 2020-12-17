package com.mina;

import org.apache.mina.filter.codec.ProtocolCodecFilter;

import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import java.io.IOException;
import java.net.InetSocketAddress;

public class MinaTimeServer
{
    private static final int PORT = 9000;
    public static void main( String[] args ) throws IOException
    {
        NioSocketAcceptor acceptor = new NioSocketAcceptor();
        acceptor.getFilterChain().addLast("protocol", new ProtocolCodecFilter(new JosnCodecFactory()));
        acceptor.setHandler( new TimeServerHandler());
        acceptor.setReuseAddress(true);
        acceptor.bind( new InetSocketAddress(PORT) );
        System.out.println("开启成功");
    }
}