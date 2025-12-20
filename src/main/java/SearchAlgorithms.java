import java.util.ArrayList;

public class SearchAlgorithms {

    public static int binarySearch(int [] sortedList, int item){
        //item is the number we are looking for and the sortedList is the haystack we are going through.

        int low = 0;
        int high = sortedList.length - 1;

        while (low<=high){
            int mid = (low + high)/2;
            int guess = sortedList[mid];

            if (guess == item){
                return mid;
            } else if (guess > item){
                high = mid + 1;
            } else{
                low = mid + 1;
            }
        }

        return 0;

    }


    //i wanted to write something for a resizable array and i couldn't do that with the regular arrays so i made use of ArrayList
    //I also had to use method overloading here so that i could have the same method that accepts an ArrayList rather than a regular Array.
    public static int binarySearch(ArrayList<Integer> sortedList, int item){
        //item is the number we are looking for and the sortedList is the haystack we are going through.

        int low = 0;
        int high = sortedList.size() - 1;

        while (low<=high){
            int mid = (low + high)/2;
            int guess = sortedList.get(mid);

            if (guess == item){
                return mid;
            } else if (guess > item){
                high = mid + 1;
            } else{
                low = mid + 1;
            }
        }

        return 0;

    }

    //i want to see if i can write a simple search.

    public static int simpleSearch(int [] sortedList, int item){
        int low = 0;
        int high = sortedList.length - 1;

        while (low<=high){
            int guess = sortedList[low];

            if (guess == item){
                return low;
            } else {
                low++;
            }
        }
        return 0;
    }
}
