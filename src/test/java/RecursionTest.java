import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    void sum() {
        int [] arrayToSum = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int n:arrayToSum){
            arrayList.add(n);
        }

        assertEquals(Recursion.sum(arrayList), 15);
    }

    @Test
    void sum1() {
        int [] arrayToSum = {10, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int n:arrayToSum){
            arrayList.add(n);
        }

        assertEquals(Recursion.sum(arrayList), 24);
    }

    @Test
    void count() {
        int [] arrayToCount = {10, 2, 3, 4, 5, 6, 7, 77};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int n:arrayToCount){
            arrayList.add(n);
        }

        assertEquals(Recursion.count(arrayList), 8);
    }
}