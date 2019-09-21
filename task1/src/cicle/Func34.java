package cicle;

public class Func34 {
    public static void main(String[] args) {
        for (int number = 1000; number < 10000; number++) {
            int firstDigit = number % 10;
            int secondDigit = number / 10 % 10;
            int thirdDigit = number / 100 % 10;
            int fourthdigit = number / 1000 % 10;
            if ((firstDigit + secondDigit + thirdDigit + fourthdigit) == 15) {
                System.out.println("Cовпадение найденно " + number);
            }
        }
    }
}
