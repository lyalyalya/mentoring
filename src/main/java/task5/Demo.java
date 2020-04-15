package task5;

import java.util.ArrayList;
import java.util.List;
import lombok.SneakyThrows;

public class Demo {

    private static final List<String> POOL = new ArrayList<>();

    @SneakyThrows
    public static void main(String[] args) {
        int iteration = 0;
        while (true) {
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 1000; j++) {
                    POOL.add(new String("j = " + j));
                }
            }
            System.out.println("Iteration " + iteration++);
            Thread.sleep(100);
        }
    }
}
