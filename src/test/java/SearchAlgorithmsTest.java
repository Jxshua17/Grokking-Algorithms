import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SearchAlgorithmsTest {

    //writing this test to compare the runtimes of simpleSearch(O(n)) against binarySearch(O(log2n))

    @Test
    void binarySearch() {
        int [] arr = {2, 3, 5, 6, 7, 23, 34, 45, 56, 67, 78};


        int x = SearchAlgorithms.binarySearch(arr, 56);

        assertEquals(arr[x], 56);
    }

    @Test
    void testBinarySearch() {
        int [] arr = {2, 3, 5, 6, 7, 23, 34, 45, 56, 67, 78};
        ArrayList<Integer> arr1 = new ArrayList<>();

        for(int n: arr) {
            arr1.add(n);
        }

        assertEquals(arr[SearchAlgorithms.binarySearch(arr1, 56)], 56);
    }

    @Test
    void simpleSearch() {
        int [] arr2 = {2, 3, 5, 6, 7, 23, 34, 45, 56, 67, 78};

        assertEquals(arr2[SearchAlgorithms.simpleSearch(arr2, 56)], 56);
    }
}

