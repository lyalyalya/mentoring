package task1;

public class Demo2 {

    private static String hello = "Hello ";
    private static String world = "world !";
    private static String result = hello + world;

    public static void concatWords() {
        while (true) {
            hello = result + hello;
            world = hello + world;
            result = world + result;
        }
    }
}
