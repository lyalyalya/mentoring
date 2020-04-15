package task3;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {

    private static String hello = "Hello ";
    private static String world = "world !";
    private static String result = hello + world;

    @SneakyThrows
    private static void concatWords() {
        while (true) {
            hello = result + hello;
            world = hello + world;
            result = world + result;
            Thread.sleep(5000);
        }
    }

    public static void main(String[] args) {
        try {
            concatWords();
        } catch (OutOfMemoryError e) {
            log.error(e.getMessage(), e);
        }
    }

}
