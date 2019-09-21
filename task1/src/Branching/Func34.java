package Branching;

import java.util.Scanner;

public class Func34 {
    static public void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int money = 15000;
        while (true) {
            System.out.println("Что-то хотите? 0-нет,1-хочу купить эту книгу");
            int decision=in.nextInt();
            switch (decision) {
                case 0: {
                    return;
                }
               case  1: {
                    System.out.println("Сколько стоит книга которую вы хотите");
                    int cost = in.nextInt();
                    System.out.println("Сколько денег у вас есть");
                    int payment = in.nextInt();
                    if (cost == payment) {
                        money += payment;
                        System.out.println("Спасибо за покупку");
                    } else {
                        if (cost > payment) {
                            System.out.println("Недостаточно средств");
                        } else {
                            if ((money + cost - payment) < 0) {
                                System.out.println("Извените но у нас нет сдачи");
                            } else {
                                money += (cost - payment);
                                System.out.println("Заберите вашу сдачу" + (money + cost - payment) + "Спасибо за покупку приходите еще");
                            }
                        }
                    }
                    break;
                }
                default:{
                    System.out.println("Повторите ");
                    break;
                }
            }
        }
    }
}
