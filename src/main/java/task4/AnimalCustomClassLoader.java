package task4;

import java.util.ArrayList;
import java.util.List;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnimalCustomClassLoader extends ClassLoader {

    private static List<Animal> animals = new ArrayList<>();

    public AnimalCustomClassLoader(ClassLoader parent) {
        super(parent);
    }

    @Override
    public Class findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }

    @Override
    @SneakyThrows
    public Class<?> loadClass(String name) {
        log.info("loading class '" + name + "'");
        Class<?> className = Class.forName(name);
        Animal instance = (Animal) className.getDeclaredConstructor().newInstance();

        animals.add(instance);
        instance.play();
        instance.voice();

        return super.loadClass(name);
    }

    public static void printLoadedClasses() {
        log.info("Custom classloader loaded: ");
        animals.forEach(a -> log.info(a.getClass().getName()));
    }
}
