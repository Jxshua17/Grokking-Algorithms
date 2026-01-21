import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathStuffTest {

    @Test
    void distanceBetweenTwoPoints() {
        int [] a = {2, 3};
        int [] b = {4, 5};

        assertEquals(2.2360679774997896, MathStuff.distanceBetweenTwoPoints(a, b));
    }

    @Test
    void square() {
        assertEquals(16, MathStuff.square(4));
    }

    @Test
    void permutation() {

        assertEquals(12, MathStuff.permutation(4,2));
    }

    @Test
    void combination() {

        assertEquals(10, MathStuff.combination(5,3));
    }
}