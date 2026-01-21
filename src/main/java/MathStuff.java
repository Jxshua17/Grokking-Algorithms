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

    public static void main(String[] args) {

        //using the main to just do a simple test because the value i get when with a calculator is different from actual.
        //floating point numbers, i suspect.

        System.out.println(MathStuff.distanceBetweenTwoPoints(new int[]{2, 3}, new int[]{4, 5}));
        System.out.println(MathStuff.factorial(5));
    }
}
