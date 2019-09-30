package cicle;

import java.util.ArrayList;
import java.util.Scanner;

public class Func31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean find = false;
        for (int i = 0; i < 5; i++) {
            list.add((int) (Math.random() * 15) + 1);
        }
        while (true) {
            int entNumber = in.nextInt();
            if (entNumber == 0) {
                return;
            }
            for (int i = 0; i < 5; i++) {
                if (list.get(i) == entNumber) {
                    System.out.println("Вы угадали число " + entNumber);
                    find = true;
                }
            }
            if (find == false) {
                System.out.println("Такого числа как " + entNumber + " у нас нет");
            } else {
                find = false;
            }
        }
    }
}
