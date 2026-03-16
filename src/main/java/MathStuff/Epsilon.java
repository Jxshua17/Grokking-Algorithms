package MathStuff;

public class Epsilon {
    public static void main(String[] args) {
        int a = (int) Math.pow(7, 2);
        int b = (int) Math.pow(2, 22);

        int c = a * b;

        System.out.println(String.valueOf(c).length());
    }
}
