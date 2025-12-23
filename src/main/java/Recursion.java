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
    public static void main(String[] args) {
        Recursion.recursion(100);
        System.out.println(Recursion.factorial(5));
    }
}
