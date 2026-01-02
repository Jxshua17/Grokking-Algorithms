import java.util.ArrayList;

public class SortingAlgorithms {

    public static int findSmallest(ArrayList<Integer> anArray){
        int smallestNumber = anArray.get(0);
        int smallestIndex = 0;

        for (int i=1;i<anArray.size();i++){
            if (anArray.get(i) < smallestNumber){
                smallestNumber = anArray.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    //exercise 4.3: find the maximum number in a list.(i already solved it even before i discovered it in the exercises. it is a remix of the above method.)

    public static int findBiggest(ArrayList<Integer> anArray){
        int biggestNumber = anArray.get(0);
        int biggestNumberIndex = 0;

        for (int i=1;i<anArray.size();i++){
            if (anArray.get(i) > biggestNumber){
                biggestNumber = anArray.get(i);
                biggestNumberIndex = i;
            }
        }
        return biggestNumberIndex;
    }

    //writing this here instead of the commit message.
    //you might be wondering why the amount of loops in the for-loop above is different from the one below. it is actually very simple.
    //with the way the logic is written for finding the index of the smallest number, you are comparing n-1 times where n is the number of items.
    //you won't be comparing the first number against itself but rather against the second and so on.
    //but in the case of selection sort, the nuumber of operation is just n times. the runtime is O(n).
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> unsortedArray){
        ArrayList<Integer> sortedArray = new ArrayList<>();
        int unsortedArraySize = unsortedArray.size();

        for(int i=1;i<=unsortedArraySize;i++){
            int smallestIndex = SortingAlgorithms.findSmallest(unsortedArray);

            sortedArray.add(unsortedArray.get(smallestIndex));
            unsortedArray.remove(smallestIndex);
        }

        /*while (sortedArray.size() != unsortedArraySize){
            int smallestIndex = SortingAlgorithms.FindSmallest(unsortedArray);

            sortedArray.add(unsortedArray.get(smallestIndex));
            unsortedArray.remove(smallestIndex);
        }*/

        return sortedArray;
    }

    //selectionSort2(an algorithm for descending order)
    public static ArrayList<Integer> selectionSort2(ArrayList<Integer> unsortedArray){
        ArrayList<Integer> sortedArray = new ArrayList<>();
        int unsortedArraySize = unsortedArray.size();

        /*for(int i=1;i<=unsortedArraySize;i++){
            int smallestIndex = SortingAlgorithms.findSmallest(unsortedArray);

            sortedArray.add(unsortedArray.get(smallestIndex));
            unsortedArray.remove(smallestIndex);
        }*/

        while (sortedArray.size() != unsortedArraySize){
            int biggestNumberIndex = SortingAlgorithms.findBiggest(unsortedArray);

            sortedArray.add(unsortedArray.get(biggestNumberIndex));
            unsortedArray.remove(biggestNumberIndex);
        }

        return sortedArray;
    }


    //the implementation of the quicksort algorithm in java
    public static ArrayList<Integer> quickSort(ArrayList<Integer> unsortedArray){
        ArrayList<Integer> lessSubArray = new ArrayList<>();
        ArrayList<Integer> largeSubArray = new ArrayList<>();
        ArrayList<Integer> sortedArray = new ArrayList<>();

        //the base case
        if (unsortedArray.size() < 2){
            return unsortedArray;
        } else { //the recursive case
            int pivot = unsortedArray.get(0);
            //TODO setting i=0 was causing the problem. investigate why.
            for(int i=1;i<unsortedArray.size();i++){
                if (unsortedArray.get(i) < pivot){
                    //lessSubArray.add(i); -> terrible. the parameter for the add method is the object and not the index.
                    lessSubArray.add(unsortedArray.get(i));
                } else{
                    largeSubArray.add(unsortedArray.get(i));
                }
            }

            while (unsortedArray.size() != sortedArray.size()){
                sortedArray.addAll(SortingAlgorithms.quickSort(lessSubArray));
                sortedArray.add(pivot);
                sortedArray.addAll(SortingAlgorithms.quickSort(largeSubArray));
            }
            return sortedArray;
        }
    }
}

//print statements for debugging is quite the interesting concept.
//i always heard of it, well i just had to wield that shit.
