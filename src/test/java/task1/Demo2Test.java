package task1;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Demo2Test {

    @Test
    @DisplayName("OOME: Java heap space. Create big objects continuously and make them stay "
            + "in memory. Do not use arrays or collections.")
    void test() {
        OutOfMemoryError exception = assertThrows(OutOfMemoryError.class, Demo2::concatWords);

        String expectedMessage = "Java heap space";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}