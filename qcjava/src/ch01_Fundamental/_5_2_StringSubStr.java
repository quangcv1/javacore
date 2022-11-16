package ch01_Fundamental;

import java.util.Arrays;

public class _5_2_StringSubStr {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        var location = greeting.substring(7, 12);
        System.out.println(location);

        //convert string to array
        String names = "Hieu, Quang, Thuy, Minh";
        String[] result = names.split(", ");
        String[] a = {"a","b","c"};
        System.out.println(Arrays.toString(a));
        System.out.println(result);
        System.out.println(Arrays.toString(result));
    }
}
