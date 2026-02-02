package Crytography.BlockTranspositionCipher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlockCipherTranspositionCipher {

    //TODO -> work on a method for finding what the prime factors of a number are.
    public static ArrayList<Integer> primeFactorization(int number){
        ArrayList<Integer> primeFactors = new ArrayList<>();



        return primeFactors;
    }

    //TODO -> work on a special configuration using the prime factors method to find the rxc for the matrix in the encryption method.

    //first, i have to create the encryption method.

    public static String encryption(String plainText){
        StringBuilder cipherText = new StringBuilder();
        int matrixRows;
        int matrixColumns;

        //Hmmmmmm! I just figured out a way to generate the perfect number of rows and columns for the matrix.
        //so after finding the length of the plainText, the next thing to do is to find the prime factors of the number...
        //...using that, if the numbers are in an array, just pick the last two values in the array.
        //take for example, 20. 2,2,5
        //so if there are duplicate numbers, you find the product of the square of the duplicate and any other number in the array.
        int lengthOfPlainText = plainText.length();
        System.out.println("the length of the plain text " + lengthOfPlainText);
        if (lengthOfPlainText % 2 != 0) {
            lengthOfPlainText++;
        }
        matrixRows = lengthOfPlainText / 2;
        matrixColumns = 2;
        System.out.println("the product is " + matrixColumns*matrixRows);

        char [][]block = new char[matrixRows][matrixColumns];

        int k=0;
        while (k<lengthOfPlainText){
            for (int i=0;i<matrixRows;i++){
                for (int j=0;j<matrixColumns;j++){
                    block[i][j] = plainText.charAt(k);
                    k++;
                }
            }
        }

        for (int j=0;j<matrixColumns;j++){
            for (int i=0;i<matrixRows;i++){
                cipherText.append(block[i][j]);
            }
        }

        return cipherText.toString();
    }

    public static void main(String[] args) {
        int [][] nums = new int[2][2];
        System.out.println(nums[0][1]);
        nums[0][1] = 45;
        System.out.println(nums[0][1]);
        System.out.println(encryption("just lemme love you."));
        System.out.println(encryption("Six Degrees of Freedom is my favourite book at the moment."));
        System.out.println(encryption("Nicolas Dickner is such a fantastic writer."));
    }
}
