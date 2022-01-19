package dev.hilligans.sandboxing.elements;

import java.nio.ByteBuffer;

public class MethodrefElement extends Element {

    @Override
    public Element readAll(ByteBuffer byteBuffer) {
        byteBuffer.getInt();
        return this;
    }
}
