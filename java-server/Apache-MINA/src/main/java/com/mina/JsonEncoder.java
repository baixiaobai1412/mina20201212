package com.mina;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;

import org.apache.mina.filter.codec.ProtocolEncoderAdapter;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

import java.nio.charset.StandardCharsets;

public class JsonEncoder extends ProtocolEncoderAdapter {

    @Override
    public void encode(IoSession ioSession, Object message, ProtocolEncoderOutput out) {
        String str = (String)message;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        IoBuffer buffer = IoBuffer.allocate(bytes.length, false);
        buffer.setAutoExpand(true);
        buffer.put(bytes);
        buffer.flip();
        out.write(buffer);
    }
}
