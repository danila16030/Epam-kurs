package cicle;

import java.util.Scanner;

public class Func38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int leftDigit = 1, rightDigit, position = 1, difference;
        boolean prog = true;
        rightDigit = (int) (number / Math.pow(10, position - 1) % 10);
        position++;
        difference = rightDigit - (int) (number / Math.pow(10, position - 1) % 10);
        while (leftDigit > 0) {
            position++;
            rightDigit = (int) (number / Math.pow(10, position - 1) % 10);
            position++;
            leftDigit = (int) (number / Math.pow(10, position - 1) % 10);
            if (leftDigit != 0 && rightDigit != 0 && (rightDigit - leftDigit) != difference) {
                prog = false;
            }
        }
        if (prog == true) {
            System.out.println("Есть прогрессия");
        } else {
            System.out.println("Нет прогрессии");
        }
    }
}
