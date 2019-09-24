package array.single;

import java.util.Random;
import java.util.Scanner;

public class Func14 {
    public static void main(String[] arg) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]= random.nextInt(100) + 1;
        }
        int max=0;
        int min=0;
        for (int i=1;i<n;i++){
            if(i%2==0){
                if(max<array[i-1]){
                    max=array[i-1];
                }
            }else {
                if(min>array[i-1]){
                    min=array[i-1];
                }
            }
        }
        System.out.println((max+min));
    }
}
