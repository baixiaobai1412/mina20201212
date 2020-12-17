package com.mina;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

public class JosnCodecFactory implements ProtocolCodecFactory {

    private final ProtocolEncoder encoder;
    private final ProtocolDecoder decoder;

    public JosnCodecFactory() {
            decoder = new JsonDecoder();
            encoder = new JsonEncoder();
    }

    public ProtocolEncoder getEncoder(IoSession ioSession) {
        return encoder;
    }

    public ProtocolDecoder getDecoder(IoSession ioSession) {
        return decoder;
    }
}
