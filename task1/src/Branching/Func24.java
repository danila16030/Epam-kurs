package Branching;

import java.util.Scanner;

public class Func24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 2 == 0) {
            System.out.println("Любит");
        } else {
            System.out.println("Не любит");
        }
    }

}
