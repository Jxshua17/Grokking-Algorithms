package UsefulMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest1 {

    @Test
    void letterCount() {
        assertEquals(1, Methods.letterCount("joshua",'a'));
    }
    @Test
    void letterCount1() {
        assertEquals(2, Methods.letterCount("international",'a'));
    }
    @Test
    void letterCount2() {
        assertEquals(3, Methods.letterCount("hippopotamus",'p'));
    }
}