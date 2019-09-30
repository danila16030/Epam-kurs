package cicle;

public class Func29 {
    public static void main(String[] args) {
        int firstNumber = 135;
        int secondNumber = 168;
        int firstDigit = 1, secPosition = 1, position = 1, secondDigit = 1;
        while (firstDigit > 0) {
            firstDigit = (int) (firstNumber / Math.pow(10, position - 1) % 10);
            secondDigit = 1;
            secPosition = 1;
            while (secondDigit > 0) {
                secondDigit = (int) (secondNumber / Math.pow(10, secPosition - 1) % 10);
                secPosition++;
                if (firstDigit == secondDigit) {
                    System.out.println("Совпала цифра " + firstDigit);
                }
            }
            position++;
        }
    }
}
