package dev.hilligans.dependencydetection.elements;

import java.nio.ByteBuffer;

public class LongElement extends Element {
    @Override
    public Element readAll(ByteBuffer byteBuffer) {
        byteBuffer.getLong();
        return this;
    }
}
