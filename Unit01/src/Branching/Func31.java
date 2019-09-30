package Branching;

public class Func31 {
    public static void main(String[] arg) {
        int a=12;
        int b=13;
        int x=5;
        int z=9;
        int y=10;
        if(a<x&&b<y||a<x&&b<z||a<z&&b<y){
            System.out.println("Влез");
        }else {
            System.out.println("Не влез");
        }
    }
}
