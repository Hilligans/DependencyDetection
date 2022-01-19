package dev.hilligans.dependencydetection.elements;

import java.nio.ByteBuffer;

public class FieldrefElement extends Element {
    @Override
    public Element readAll(ByteBuffer byteBuffer) {
        byteBuffer.getInt();
        return this;
    }
}
