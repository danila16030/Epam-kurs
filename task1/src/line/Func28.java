package line;

public class Func28 {
    public static void main(String[] args) {
        double rad = 3.15;
        double grad = (rad * 180) / Math.PI;//пернвод в градусы
        double min = (grad * 60) % 60;
        int sec = (int) ((min * 60) % 60);
    }
}
