package array.single;

import java.util.Random;
import java.util.Scanner;

public class Func12 {
    public static void main(String[] arg) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
           array[i]= random.nextInt(100) + 1;
        }
        for (int i = 0; i < n; i++) {
            for (int k = 2; k < array[i]; k++) {
                if (array[i] % k == 0) {
                sum+=array[i];
                }
            }
        }
        System.out.println(sum);
    }
}
