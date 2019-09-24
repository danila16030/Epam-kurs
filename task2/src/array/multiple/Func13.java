package array.multiple;

import java.util.Scanner;

public class Func13 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 2 != 0) {
            n--;
        }
        int[][] array = new int[n][n];
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 != 0) {
                for (int k = 0; k < n; k++) {
                    array[i - 1][k] = k + 1;
                }
            } else {
                for (int k = 0; k < n; k++) {
                    array[i - 1][k] = n - k;
                }
            }
        }
    }
}
