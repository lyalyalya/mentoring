package task1;

public class Demo5 {

    private Demo5 instance = new Demo5();

    public Demo5() {
        throw new RuntimeException("I'm not coming out");
    }

    public static void createInstance() {
        new Demo5();
    }
}
