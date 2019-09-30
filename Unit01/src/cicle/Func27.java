package cicle;

import java.util.Scanner;

public class Func27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        while (m < n) {
            for (int i = 2; i < m - 1; i++) {
                if (m % i == 0) {
                    System.out.println(i + " делитель " + m);
                }
            }
            m++;
        }
    }
}
