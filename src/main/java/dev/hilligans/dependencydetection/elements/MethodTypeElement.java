package dev.hilligans.dependencydetection.elements;

import java.nio.ByteBuffer;

public class MethodTypeElement extends Element {

    @Override
    public Element readAll(ByteBuffer byteBuffer) {
        System.out.println("e");
        byteBuffer.getShort();
        return this;
    }
}
