package cicle;

public class Func14 {
    public static void main(String[] args) {
        int n = 5;
        double answer = 0;
        for (double i = 0; i < n; i++) {
            double temp = 1 / (i + 1);
            answer += temp;
        }
    }
}
