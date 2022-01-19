package dev.hilligans.sandboxing.elements;

import java.nio.ByteBuffer;

public abstract class Element {

    public abstract Element readAll(ByteBuffer byteBuffer);

}
