import java.util.ArrayList;

public class Recursion {

    //this recursion is funny because it is stuck in an infinite loop
    //and you can't use a break statement except in a loop like while or for and when you do that...
    //the loop still continues despite the while condition being false.
    public static int recursion(int i){
        System.out.println(i + "...");
        if (i<=0){
            return i; //a base case.
        } else{
            return recursion(i-1); //a recursive case.
        }
    }

    public static int factorial(int n){
        if (n==1){
            return n; //a base case.
        }else {
            return n*(factorial(n-1)); //a recursive case.
        }
    }

    //exercise 4.1
    public static int sum(ArrayList<Integer> arrayList){
        int sum = 0;

        if(arrayList.size() == 1){
           sum = sum + arrayList.get(0);
        }else{
            sum = sum + arrayList.get(0);
            arrayList.remove(0);
            int sumOfTheRestOfTheArray = Recursion.sum(arrayList);
            sum = sum + sumOfTheRestOfTheArray;
        }
        return sum;
    }

    //exercise 4.2
    public static int count(ArrayList<Integer> arrayList){
        int count = 0;

        if (arrayList.size() == 1){
            count = 1;
        }else {
          count = 1;
          arrayList.remove(0);
          count = count + Recursion.count(arrayList);
        }
        return count;
    }
    public static void main(String[] args) {
        Recursion.recursion(100);
        System.out.println(Recursion.factorial(5));
    }
}
