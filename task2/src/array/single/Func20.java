package array.single;

import java.util.Random;

public class Func20 {
    public static void main(String[] arg) {
        int array[]=new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(6) + 1;
        }
        for (int i=1;i<10;i++){
            if(i%2==0){
                array[i-1]= 0;
            }
        }
    }
}
