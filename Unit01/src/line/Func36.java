package line;

public class Func36 {
    public static void main(String[] args) {
        int number = 1234;
        double chet = 1;
        double nech = 1;
        for (int i = 1; i < 5; i++) {
            int digit = number % 10;
            number /= 10;
            if (i % 2 == 0) {
                chet = chet * digit;
            } else {
                nech = nech * digit;
            }
        }
        double chastn = chet / nech;
    }
}
