package cicle;

public class Func15 {
    public static void main(String[] args) {
        long result = 1;
        int sum = 1;
        for (int i = 2; i < 11; i++) {
            sum += i;
            result *= sum;
        }
    }
}
