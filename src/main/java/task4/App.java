package task4;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    @SneakyThrows
    public static void main(String[] args) {
        log.info("Starting task 4: loading animal classes...");

        ClassLoader parentClassLoader = Animal.class.getClassLoader();
        ClassLoader customClassLoader = new AnimalCustomClassLoader(parentClassLoader);

        Class.forName("task4.impl.Dog", true, customClassLoader);
        Class.forName("task4.impl.Cat", true, customClassLoader);

        AnimalCustomClassLoader.printLoadedClasses();
    }

}
