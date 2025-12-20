import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmsTest {

    @Test
    void findSmallest() {
        int [] unsortedArray = {2, 3, 5, 23, 54, 65, 76, 12, 32, 21, 43, 64, 78};
        ArrayList<Integer> unsortedArray1 = new ArrayList<>();

        for (int n: unsortedArray){
            unsortedArray1.add(n);
        }
        int [] returnedArray = SortingAlgorithms.FindSmallest(unsortedArray1);
        int smallestNumber = returnedArray[1];

        assertEquals(smallestNumber, 2);
    }

    @Test
    void selectionSort() {
        int [] unsortedArray = {2, 3, 5, 23, 54, 65, 76, 12, 32, 21, 43, 64, 78};
        int [] sortedArray = {2, 3, 5, 12, 21, 23, 32, 43, 54, 64, 65, 76, 78};
        ArrayList<Integer> unsortedArray1 = new ArrayList<>();
        ArrayList<Integer> sortedArray1 = new ArrayList<>();

        for (int n: unsortedArray){
            unsortedArray1.add(n);
        }

        for (int n: sortedArray){
            sortedArray1.add(n);
        }


        assertEquals(SortingAlgorithms.SelectionSort(unsortedArray1), sortedArray1);
    }
}