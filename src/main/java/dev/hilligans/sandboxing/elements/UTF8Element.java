package dev.hilligans.sandboxing.elements;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class UTF8Element extends Element {

    public String string;

    @Override
    public Element readAll(ByteBuffer byteBuffer) {
        short length = byteBuffer.getShort();
        byte[] data = new byte[length];
        for(int x = 0; x < length; x++) {
            data[x] = byteBuffer.get();
        }
        string = new String(data, StandardCharsets.UTF_8);
        return this;
    }
}
