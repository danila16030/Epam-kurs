package array.multiple;

import java.util.Random;
import java.util.Scanner;

public class Func40 {

    public static void main(String[] arg) {
        int n = 3;
        int averageNumber = (n * n + 1) / 2;
        int intermidiateValue = 0;
        int[][] array = new int[n][n];
        array[n / 2][n / 2] = averageNumber;
        for (int i = 1; i < n / 2 + 1; i++) {
            array[n / 2 - i][n / 2 - i] = averageNumber - n * i;
            array[n / 2 + i][n / 2 + i] = averageNumber + n * i;
            array[n / 2 + i][n / 2 - i] = averageNumber - i;
            array[n / 2 - i][n / 2 + i] = averageNumber + i;
            array[n / 2][n / 2 - i] = averageNumber + (averageNumber - 1)/i;
            array[n / 2][n / 2 + i] = averageNumber - (averageNumber - 1)/i;
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(array[i][k] + " ");
            }
            System.out.println();
        }
    }
}
