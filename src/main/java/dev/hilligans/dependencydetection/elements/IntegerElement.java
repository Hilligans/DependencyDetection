package dev.hilligans.dependencydetection.elements;

import java.nio.ByteBuffer;

public class IntegerElement extends Element {
    @Override
    public Element readAll(ByteBuffer byteBuffer) {
        byteBuffer.getInt();
        return this;
    }
}
