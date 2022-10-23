package ch01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ArrayList-class: for arrays that grow and shrink on demand, also a part of a larger collections framework in Chap07
 * @ArrayIndexOutOfBoundsException: if try to access an element that does not exist
 * @array.length
 * @array-construction: numeric with 0, boolean with false, objects with null
 */
public class _8_1_ArrayBasic {
    public static void main(String[] args) {
        //declare
        String[] names;
        names = new String[100]; //initialize
        //combine
        String[] names1 = new String[100];

        //construct object
        BigInteger[] numbers = new BigInteger[100]; //an array of 100 null references
        for(int i = 0; i<100; i++) {
            numbers[i] = BigInteger.valueOf(i);//fill values
        }

        //construct with values
        int[] primes = {2,3,5,7,11,13};
        System.out.println("prime: " + Arrays.toString(primes));
        String[] authors = {
                "Quang",
                "Hieu",
                "Thuy",
                "Minh",
        };

        //assign to an existing array
        primes = new int[] {17,19,23, 29,31};
        System.out.println("primes: " + primes);
        System.out.println(Arrays.toString(primes));

    }
}
