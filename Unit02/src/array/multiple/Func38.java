package array.multiple;

import java.util.Random;
import java.util.Scanner;

public class Func38 {


    public static void main(String[] arg) {
        int n = 5;
        int[][] firstArray = new int[n][n];
        int[][] secondArray = new int[n][n];
        int[][] finalArray = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                firstArray[i][k] = random.nextInt(9)+1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                secondArray[i][k] = random.nextInt(9)+1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                finalArray[i][k] =secondArray[i][k]+finalArray[i][k];
            }
        }
    }
}