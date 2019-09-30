package line;

public class Func37 {
    public static void main(String[] args) {
        int n = 12;
        int x = 5234;
        int firstTwo = 0, secondTwo = 0;
        int point = 15;
        int m = 1;
        int a = 5, b = 5, c = 1;
        if (n % 2 == 0 && n % 100 == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        firstTwo = x % 10 + x / 10 % 10;
        secondTwo = x / 100 % 10 + x / 1000 % 10;
        if (firstTwo == secondTwo) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        n = 123;
        int sum = n % 10 + n / 10 % 10 + n / 100 % 10;
        if (sum % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (m < point && point < n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (a == b || a == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int firstSum = n % 10 + n / 10 % 10;
        int secondSum = n % 10 + n / 100 % 10;
        int thirdSum = n / 100 % 10 + n / 10 % 10;

        if (firstSum == secondSum || firstSum == thirdSum || secondSum == thirdSum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (n == a || n == 1 || n == Math.pow(a, 2) || n == Math.pow(a, 3) || n == Math.pow(a, 4)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (n == a * Math.sqrt(m) + b * m + c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
