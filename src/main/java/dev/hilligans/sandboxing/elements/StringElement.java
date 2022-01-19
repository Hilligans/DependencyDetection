package dev.hilligans.sandboxing.elements;

import java.nio.ByteBuffer;

public class StringElement extends Element {

    public short index;

    @Override
    public Element readAll(ByteBuffer byteBuffer) {
        index = byteBuffer.getShort();
        return this;
    }
}
