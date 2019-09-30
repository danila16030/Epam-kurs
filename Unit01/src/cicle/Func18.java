package cicle;

public class Func18 {
    public static void main(String[] args) {
        double e = 0.05;
        double temp;
        double res = 0;
        for (int i = 1; i < 15; i++) {
            temp = Math.pow(-1, i - 1) / i;
            if (Math.abs(temp) >= e) {
                res += temp;
            }
        }
    }
}
