package dev.hilligans.sandboxing.elements;

import java.nio.ByteBuffer;

public class LongElement extends Element {
    @Override
    public Element readAll(ByteBuffer byteBuffer) {
        byteBuffer.getLong();
        return this;
    }
}
