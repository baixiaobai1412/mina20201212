package com.mina;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.*;

import java.nio.charset.StandardCharsets;

public class JsonDecoder extends CumulativeProtocolDecoder {

    protected boolean doDecode(IoSession session, IoBuffer in, ProtocolDecoderOutput out) {
        if (in.remaining() >= 4) {
            int width = in.getInt();
            byte[] bytes = new byte[width];
            in.get(bytes);
            String str = new String(bytes, StandardCharsets.UTF_8);
            JsonTest jsonTest = JsonUtils.fromJson(str, JsonTest.class);
            assert jsonTest != null;
            String content= jsonTest.getMeans();
            out.write(content);
            return true;
        }
        else{
            return false;
        }
    }
}
