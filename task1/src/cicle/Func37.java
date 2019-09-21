package cicle;

public class Func37 {
    public static void main(String[] args) {
        for (int a = 10; a < 99; a++) {
            for (int b = 10; b < 99; b++) {
                if ((a * 100 + b) % 99 == 0 && (b * 100 + a) % 49 == 0) {
                    System.out.println("Комбинация " + a + "и " + b);
                }
            }
        }
    }
}
