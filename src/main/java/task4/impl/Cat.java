package task4.impl;

import lombok.extern.slf4j.Slf4j;
import task4.Animal;

@Slf4j
public class Cat extends Animal {

    @Override
    protected void play() {
        log.info("Cat is playing");
    }

    @Override
    protected void voice() {
        log.info("Mew!");
    }
}
