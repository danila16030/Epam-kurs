package line;

public class Func35 {
    public static void main(String[] args) {
        double m = 150;
        double n = 14;
        double fin = m / n;
        int temp = (int) (m / n);
        int drob = (int) ((fin - temp) * 10);
        int cel = (int) (fin % 10);
    }
}
