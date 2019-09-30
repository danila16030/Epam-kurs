package array.multiple;

import java.util.Scanner;

public class Func15 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pos = 0;
        if (n % 2 != 0) {
            n--;
        }
        int[][] array = new int[n][n];
        for (int i = 1; i < n + 1; i++) {
            array[i - 1][pos] = n - pos ;
            pos++;
        }
    }
}
