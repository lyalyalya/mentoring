package task1;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Demo5Test {

    @Test
    @DisplayName("SOE: Do not use recursive methods. Don’t tune stack size.")
    void test() {
        assertThrows(StackOverflowError.class, Demo5::createInstance);
    }

}