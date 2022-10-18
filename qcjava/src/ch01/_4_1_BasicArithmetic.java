package ch01;

public class _4_1_BasicArithmetic {
    public static void main(String[] args) {
        // Division and remainder

        System.out.println(17 / 5);
        System.out.println(17 % 5);
        System.out.println(Math.floorMod(17, 5));

        System.out.println(-17 / 5);
        System.out.println(-17 % 5);
        System.out.println(Math.floorMod(-17, 5));

        // Increment and decrement

        int[] a = { 17, 29 };
        int n = 0;
        System.out.printf("%d %d\n", a[n++], n);
        n = 0;
        System.out.printf("%d %d\n", a[++n], n);

        // Powers and roots

        System.out.println(Math.pow(10, 9));
        System.out.println(Math.sqrt(1000000));
    }
}
