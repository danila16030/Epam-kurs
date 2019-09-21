package cicle;

import java.util.Scanner;

public class Func28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int x = in.nextInt();
            int y = in.nextInt();
            double z = 0;
            char simvol = in.next().charAt(0);
            switch (simvol) {
                case 47:// /
                {
                    if (y != 0) {
                        z = x / y;
                        System.out.println("Z равен :" + z);
                    } else {
                        System.out.println("Нельзя делить на 0 ");
                    }
                    break;
                }
                case 42://*
                {
                    z = x * y;
                    System.out.println("Z равен :" + z);
                    break;
                }
                case 45://-
                {
                    z = x - y;
                    System.out.println("Z равен :" + z);
                    break;
                }
                case 43://+
                {
                    z = x + y;
                    System.out.println("Z равен :" + z);
                    break;
                }
                case 48://0
                {
                    return;
                }
                default: {
                    System.out.println("Такой функции нет");
                    break;
                }
            }
        }
    }
}
