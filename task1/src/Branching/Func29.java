package Branching;

import static java.lang.Math.*;

public class Func29 {
    public static void main(String[] arg) {
        int x1 = 21;
        int y1 = 11;
        int x2 = 22;
        int y2 = 12;
        int x3 = 23;
        int y3 = 13;
        double a = sqrt(pow(abs(x1 - x2), 2) + pow(abs(y1 - y2), 2));
        double b = sqrt(pow(abs(x2 - x3), 2) + pow(abs(y2 - y3), 2));
        double c = sqrt(pow(abs(x1 - x3), 2) + pow(abs(y1 - y3), 2));
        double p = (a + b + c) / 2;
        double s = sqrt(p * (p - a) * (p - b) * (p - c));
        if (s == 0) {
            System.out.println("Точки лежат в на одной прямой");
        }
        /*
        бразуем из этих трёх точек треугольник. a, b, c - стороны треугольника. p - полу-периметр треугольника.
         s - площадь треугольника. Площадь вычисляется по формуле Герона. Если площадь равна нуля,
         значит точки лежат на одной прямой. Если нет - не лежат. 
         */
    }
}
