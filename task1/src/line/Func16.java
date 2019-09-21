package line;

public class Func16 {
    public static void main(String[] args) {
        int number = 1234;
        int result = 1;
        for (int i = 0; i < 4; i++) {
            result *= number % 10;
            number = number / 10;
        }
    }
}
