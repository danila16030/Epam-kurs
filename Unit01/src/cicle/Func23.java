package cicle;

public class Func23 {
    public static void main(String[] args) {
        double temp, b = 5;
        for (double x = 1; x <= b; x += 0.5) {
            temp = 1 / Math.tan(x / 3) + 1 / 2 * Math.sin(x);
            System.out.println("значение аргумента: " + x + " Значение функции: " + temp);
        }

    }
}
