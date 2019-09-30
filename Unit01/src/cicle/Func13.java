package cicle;

public class Func13 {
    public static void main(String[] args) {
        double x = -5;
        double y;
        do {
            y = 5 - x * x / 2;
            System.out.println(y);
            x += 0.5;
        } while (x <= 5);
    }


}
