package line;

public class Func21 {
    public static void main(String[] args) {
        double r = 123.456;
        double real = (int) r;
        int fractional = (int) ((r - real) * 1000);
        double result = fractional + (real / 1000);
    }
}
