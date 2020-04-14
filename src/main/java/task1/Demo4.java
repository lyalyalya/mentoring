package task1;

public class Demo4 {

    public static final int INIT_VALUE = 1;

    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);
        recursivePrint(++num);
    }

    public static void startRecursion() {
        Demo4.recursivePrint(INIT_VALUE);
    }
}
