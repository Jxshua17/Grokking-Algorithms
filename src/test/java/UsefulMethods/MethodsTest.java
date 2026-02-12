package UsefulMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    @Test
    void removeLastChar() {
        assertEquals("joshu", Methods.removeLastChar("joshua"));
    }

    @Test
    void r1(){
        assertEquals("fuckingDisgustin", Methods.removeLastChar("fuckingDisgustinG"));
    }

    @Test
    void r2(){
        assertEquals("Lisa and Eric", Methods.removeLastChar("Lisa and Eric."));
    }
    @Test
    void r3(){
        assertEquals("", Methods.removeLastChar(""));
    }
}