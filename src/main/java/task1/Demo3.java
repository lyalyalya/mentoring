package task1;

import javassist.CannotCompileException;
import javassist.ClassPool;

public class Demo3 {

    private static ClassPool classPool = ClassPool.getDefault();

    //-XX:MaxMetaspaceSize=20m
    public static void main(String[] args) throws CannotCompileException {
        int i = 0;
        while (true) {
            classPool.makeClass("GeneratedClassWithNumber" + i++).toClass();
        }
    }
}
