package dev.hilligans.dependencydetection.elements;

import java.nio.ByteBuffer;

public class ClassElement extends Element {

    public short index;

    @Override
    public Element readAll(ByteBuffer byteBuffer) {
        index = byteBuffer.getShort();
        return this;
    }
}
