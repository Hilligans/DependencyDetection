package dev.hilligans.dependencydetection;

import dev.hilligans.dependencydetection.elements.*;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Supplier;

public class Sandboxing {

    static Supplier<Element>[] supplier;

    public static boolean debug = false;

    public static ArrayList<String> getDependencies(byte[] rawClassData) {
        HashMap<Integer, Element> classElementHashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        ByteBuffer byteBuffer = ByteBuffer.wrap(rawClassData);

        byteBuffer.getInt(); //magic number
        byteBuffer.getInt(); //version numbers
        short count = byteBuffer.getShort();
        for(int x = 0; x < count - 1; x++) {
            byte id = byteBuffer.get();
            Element element = supplier[id - 1].get().readAll(byteBuffer);
            if(debug) {
                System.out.print(id);
                if (element instanceof UTF8Element utf8Element) {
                    System.out.print(" " + utf8Element.string);
                }
                System.out.println();
            }
            classElementHashMap.put(x,element);
        }

        for(int x : classElementHashMap.keySet()) {
            Element element = classElementHashMap.get(x);
            if(element instanceof ClassElement classElement) {
                UTF8Element utf8Element = (UTF8Element) classElementHashMap.get((int)classElement.index - 1);
                arrayList.add(utf8Element.string);
            }
        }
        return arrayList;
    }

    static {
        supplier = new Supplier[18];
        supplier[0] = UTF8Element::new;
        supplier[2] = IntegerElement::new;
        supplier[3] = FloatElement::new;
        supplier[4] = LongElement::new;
        supplier[5] = DoubleElement::new;
        supplier[6] = ClassElement::new;
        supplier[7] = StringElement::new;
        supplier[8] = FieldrefElement::new;
        supplier[9] = MethodrefElement::new;
        supplier[10] = InterfaceMethodrefElement::new;
        supplier[11] = NameAndTypeElement::new;
        supplier[14] = MethodHandleElement::new;
        supplier[15] = MethodTypeElement::new;
        supplier[17] = InvokeDynamicElement::new;
    }




}
