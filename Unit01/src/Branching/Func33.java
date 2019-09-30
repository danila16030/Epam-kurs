package Branching;

import java.util.Scanner;

public class Func33 {
    static public void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int parol = in.nextInt();
        switch (parol) {
            case 1747:
            case 9583: {
                System.out.println("Пулучен доступ к A,B,C");
                break;
            }
            case 7922:
            case 3331: {
                System.out.println("Пулучен доступ к B,C");
                break;
            }
            case 9455:
            case 8997: {
                System.out.println("Пулучен доступ к C");
                break;
            }
        }
    }
}
