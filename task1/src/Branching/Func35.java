package Branching;

import java.util.Scanner;

public class Func35 {
    static public void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = 1;
        int day = in.nextInt();
        while (day > days[month - 1]) {
            day -= days[month++ - 1];
        }
        System.out.println("Month = " + month + ", day = " + day);

    }
}
