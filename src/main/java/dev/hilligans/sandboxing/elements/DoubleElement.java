package dev.hilligans.sandboxing.elements;

import java.nio.ByteBuffer;

public class DoubleElement extends Element {
    @Override
    public Element readAll(ByteBuffer byteBuffer) {
        byteBuffer.getDouble();
        return this;
    }
}
