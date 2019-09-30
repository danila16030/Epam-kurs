package array.single;

import java.util.Random;
import java.util.Scanner;

public class Func16 {
    public static void main(String[] arg) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        int max=0;
        int halfSum=0;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        for (int i=1;i<n;i++){
            if(i%2!=0){
                halfSum=array[i-1];
            }else {
                halfSum+=array[i-1];
                if(max<halfSum){
                    max=halfSum;
                }
            }
        }
        System.out.println(max);
    }
}
