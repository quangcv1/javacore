package ch01;

public class _4_4_NumberTypeConversions {
    public static void main(String[] args) {
        // Number conversions
        int[] a = { 17, 29 };
        int n = 0;

        double x = 42;
        System.out.println(x); // 42.0

        float f = 123456789;
        System.out.println(f); // 1.23456792E8

        x = 3.75;
        n = (int) x;
        System.out.println(n); // 3

        n = (int) Math.round(x);
        System.out.println(n); // 4

        System.out.println('J' + 1); // 75
        char next = (char)('J' + 1);
        System.out.println(next); // 'K'

        n = (int) 3000000000L;
        System.out.println(n); // -1294967296
    }
}
