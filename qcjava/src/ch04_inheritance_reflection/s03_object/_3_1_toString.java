package ch04_inheritance_reflection.s03_object;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @des: yields a string representation of this obj
 * @default: the name of the class + the hash code
 * @alternative_syntax: instead of writing x.toString(), u can write "" + x. This expression even works if x is null or a primitive type value.
 * @with_Array: the array type is printed in an archaic format. Ex:
 * <pre>{@code
 * int[] primes = {2,3,5,7,11,13}
 * }</pre>
 * then primes.toString() yields a string such as "[I@1a46e30" the prefix [I denotes an array of integers
 */
public class _3_1_toString {


    public static void main(String[] args) {
        Point p = new Point(10,20);
        System.out.println(p); //or p.toString() => java.awt.Point[x=10,y=20] = class name + instance variable enclosed in square brackets
        System.out.println("" + p); //this expression even works if p is null or a primitive type value

        //Override toString method with anonymous subclass
        var p1 = new Point(5,10) {
            @Override
            public String toString() {
                return getClass().getName() + "[" + x + "," + y + "]";
            }
        };
        System.out.println(p1); //ch04_inheritance_reflection.s03_object._3_1_toString$1[5,10]
        System.out.println(""+ p1);

        //SYSTEM OUTPUT
        System.out.println(System.out);//java.io.PrintStream@12edcd21

        //toString with Array
        int[] primes = {1,3,5,7,11,13};
        System.out.println("primes: " + primes.toString());
        System.out.println("primes: " + Arrays.toString(primes));

        //multi-dimension array
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println("matrix: " + matrix.toString());
        System.out.println("matrix: " + Arrays.toString(matrix));
        System.out.println("matrix: " + Arrays.deepToString(matrix));
    }
}
