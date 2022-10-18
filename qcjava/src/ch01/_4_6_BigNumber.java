package ch01;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * when the precision of the primitive int and float types is not sufficient. You can turn to the BigInteger and BigDecimal classes in the java.math package.
 * Computations with big numbers are far slower than with primitive numeric types.
 * @valueOf-method: turns a long into a BigInteger
 * @note: java does not permit the use of operators with objects, so you must use method calls to work with big numbers
 * @BigDecimal.valueOf(n,e): nx10^-e
 */

public class _4_6_BigNumber {
    public static void main(String[] args) {
        //turns a long into a BigInteger
        BigInteger n = BigInteger.valueOf(876543210123456789L);
        System.out.println("n: " + n);

        //construct a BigInteger from a string of digits
        BigInteger k = new BigInteger("9876543210123456789");
        BigInteger zero = BigInteger.ZERO;
        BigInteger one = BigInteger.ONE;
        BigInteger ten = BigInteger.TEN;
        System.out.println("k: " + k);
        System.out.println("ten: "+ ten + " and zero: " + zero);

        //call methods instead of operators
        BigInteger r = BigInteger.valueOf(5).multiply(n.add(k)); //r = 5*(n+k)
        System.out.println("r: " + r);

        //BigDecimal
        System.out.println(BigDecimal.valueOf(2,0));
        System.out.println(BigDecimal.valueOf(17,1));
        System.out.println(BigDecimal.valueOf(2,0)
                .subtract(BigDecimal.valueOf(17,1)));
    }

}
