package task1;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Demo1Test {

    @Test
    @DisplayName("OOME: Java heap space. You can use different data structures."
            + "Do not tune heap size.")
    void test() {
        OutOfMemoryError exception = assertThrows(OutOfMemoryError.class,
                Demo1::createBigArray);

        String expectedMessage = "Java heap space";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}