package cicle;

import java.util.Scanner;

public class Func24 {
    public static void main(String[] args) {
        int temp = 1, position = 1, result = 0;

        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int n = in.nextInt();
            while (temp > 0) {
                if (position % 2 == 0) {
                    temp = (int) (n / Math.pow(10, position - 1) % 10);
                    position++;
                } else {
                    temp = (int) (n / Math.pow(10, position - 1) % 10);
                    position++;
                }
            }
            for (int i = 1; i < position; i++) {
                temp = (int) ((int) (n / Math.pow(10, i - 1)) % 10 * Math.pow(10, position - i - 2));
                result += temp;
            }

        } else {
            System.out.println("Вы ввели не целое число");
        }

    }
}
