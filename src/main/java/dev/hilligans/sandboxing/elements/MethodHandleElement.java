package dev.hilligans.sandboxing.elements;

import java.nio.ByteBuffer;

public class MethodHandleElement extends Element {
    @Override
    public Element readAll(ByteBuffer byteBuffer) {
        byteBuffer.get();
        byteBuffer.getShort();
        return this;
    }
}
