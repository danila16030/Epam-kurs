package array.multiple;

import java.util.Random;
import java.util.Scanner;

public class Func11 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int m = in.nextInt();
        int n = in.nextInt();
        int array[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) {
                array[i][k] = random.nextInt(9) + 1;
            }
        }
        for (int i = 1; i < m + 1; i++) {
            if (i % 2 != 0) {
                for (int k = n - 1; k != -1; k--) {
                    System.out.print(array[i - 1][k] + " ");
                }
            } else {
                for (int k = 0; k < n; k++) {
                    System.out.print(array[i - 1][k] + " ");
                }
            }
            System.out.println();
        }
    }
}
