package cicle;

public class Func36 {
    public static void main(String[] args) {
        for (int number = 1010; number < 9999; number++) {
            int first = number % 100;
            int second = number / 100 % 100;
            if (first != 0 && number % (first * second) == 0) {
                System.out.println(number);
            }
        }
    }
}
