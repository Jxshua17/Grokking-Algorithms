public class SearchAlgorithms {

    public int BinarySearch(int [] sortedList, int item){
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

    //i want to see if i can write a simple search.

    public int SimpleSearch(int [] sortedList, int item){
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
