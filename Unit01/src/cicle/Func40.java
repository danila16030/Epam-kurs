package cicle;

import java.util.Scanner;

public class Func40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int digit = 1, position = 1;
        boolean find = true;
        for (int number = 19; number < n; number++) {
            while (digit > 0) {
                digit = (int) (number / Math.pow(10, position - 1) % 10);
                position++;
                if (digit == 0 && position == 2 || digit != 0 && (number % digit) != 0) {
                    find = false;
                }
            }
            digit = 1;
            position = 1;
            if (find == true) {
                System.out.println(number);
            }
            find = true;
        }
    }
}
