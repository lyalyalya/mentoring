package task1;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Demo4Test {

    @Test
    @DisplayName("SOE: Use recursive methods. Don’t tune stack size.")
    void test() {
        assertThrows(StackOverflowError.class, Demo4::startRecursion);
    }

}