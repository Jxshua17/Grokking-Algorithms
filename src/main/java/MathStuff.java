import java.util.Arrays;

public class MathStuff {
    //i got bored so instead of taking a break to do something else, here i am writing a method that allows me...
    //...to calculate the distance between two points in a cartesian plane

    public static double distanceBetweenTwoPoints(int[] a, int[] b) {
        int x = b[0] - a[0];
        int y = b[1] - a[1];
        int distance = MathStuff.square(x) + MathStuff.square(y);

        return Math.sqrt(distance);
    }

    public static int square(int number) {
        return number * number;
    }

    public static int factorial(int r) {

        if (r == 1) {
            return r;
        } else {
            return MathStuff.factorial(r - 1) * r;
        }
    }

    public static int permutation(int n, int r){
        return (MathStuff.factorial(n))/(MathStuff.factorial(n-r));
    }

    public static int combination(int n, int r){
        return (MathStuff.factorial(n))/((MathStuff.factorial(n-r))*(MathStuff.factorial(r)));
    }

    public static void main(String[] args) {

        //using the main to just do a simple test because the value i get when with a calculator is different from actual.
        //floating point numbers, i suspect.

        System.out.println(MathStuff.distanceBetweenTwoPoints(new int[]{2, 3}, new int[]{4, 5}));
        System.out.println(MathStuff.factorial(5));


        //solving the daily math calender for day 28 in january.
        //find the largest number AB where A340B is divisible by 88.
        String number = "A340B";
        System.out.println(number.length());

        System.out.println(number.charAt(0));

        String newNumber = number.replace('A', '1');
        System.out.println(newNumber.charAt(0));

        char [] chars;
        int largestNumber = 0;

        for (int i=1;i<10;i++){
            for (int j=0;j<10;j++){
                chars = number.toCharArray();

                chars[0] = (char) (i + 48);
                chars[4] = (char) (j + 48);

                String num2 = String.copyValueOf(chars);

                int x = Integer.parseInt(num2);

                if(x % 88 == 0 && x > largestNumber){
                    largestNumber = x;
                }
            }
        }

        String finalResult = String.valueOf(largestNumber);

        String numAB = finalResult.charAt(0) + String.valueOf(finalResult.charAt(4));

        int large = Integer.parseInt(numAB);

        System.out.println("the final answer is AB = "+large);


        //i was just getting the wrong answer even aftr debugging and seeing nothing wrong with my code.
        //just read the question, and it is 88 and not 8.

        //Might not be efficient because time complexity is O(n^2).


    }
}
