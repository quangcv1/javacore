package ch01;

import java.util.Arrays;

public class _9_2_ArrayParaAndReturnValues {
    public static void swap(int[] values, int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }
    public static int[] firstLast(int[] values) {
        if (values.length ==0) return new int[0];
        else return new int[] {
                values[0], values[values.length-1]
        };
    }
    public static void main(String[] args) {
        int[] fibs = { 1, 1, 2, 3, 5, 8, 11, 13 };
        System.out.println(Arrays.toString(fibs));
        swap(fibs, 2, fibs.length - 2);
        System.out.println(Arrays.toString(fibs));
        System.out.println(Arrays.toString(firstLast(fibs)));
    }
}
