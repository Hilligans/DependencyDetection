package dev.hilligans.sandboxing.elements;

import java.nio.ByteBuffer;

public class FloatElement extends Element {

    @Override
    public Element readAll(ByteBuffer byteBuffer) {
        byteBuffer.getFloat();
        return this;
    }
}
