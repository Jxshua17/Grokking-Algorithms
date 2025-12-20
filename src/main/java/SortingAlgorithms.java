import java.util.ArrayList;
import java.util.Optional;

public class SortingAlgorithms {

    public static int[] FindSmallest(ArrayList<Integer> anArray){
        int smallestNumber = anArray.get(0);
        int smallestIndex = 0;

        for (int i=1;i<anArray.size();i++){
            if (anArray.get(i) < smallestNumber){
                smallestNumber = anArray.get(i);
                smallestIndex = i;
            }
        }
        return new int[]{smallestIndex, smallestNumber};
    }

    public static ArrayList<Integer> SelectionSort(ArrayList<Integer> unsortedArray){
        ArrayList<Integer> sortedArray = new ArrayList<>();
        int unsortedArraySize = unsortedArray.size();

        for(int i=1;i<=unsortedArraySize;i++){
            int [] returnedArray = SortingAlgorithms.FindSmallest(unsortedArray);
            int smallestIndex = returnedArray[0];
            int smallestNumber = returnedArray[1];

            unsortedArray.remove(smallestIndex);
            sortedArray.add(smallestNumber);
        }

        /*while (sortedArray.size() != unsortedArraySize){
            int [] returnedArray = SortingAlgorithms.FindSmallest(unsortedArray);
            int smallestIndex = returnedArray[0];
            int smallestNumber = returnedArray[1];

            unsortedArray.remove(smallestIndex);
            sortedArray.add(smallestNumber);
        }*/
        return sortedArray;
    }
}

//print statements for debugging is quite the interesting concept.
//i always heard of it, well i just had to wield that shit.
