package ch01_Fundamental;

import java.util.Arrays;

/**
 * @codepoint: 'A' is U+0041
 * @codeunit: a char is not a Unicode character or codepoint. It's a code unit a 16 bit quantity used in the UTF-16 encoding
 * @codePoints(): yields a stream of int values, one for each code point
 * @history: strings were always internally represented in the UTF-16 encoding, as arrays of char values. Nowadays, String objs use a byte array of ISO-8859-1 when possible. A future version of java may switch to using UTF-8 internally
 */
public class _5_6_codePoints_CodeUnits {
    public static void main(String[] args) {
        //basic
        String str = "Hello";
        char ch = str.charAt(3);
        System.out.println("char at 3: " + ch + " and length: " + str.length());
        //handle properly
        //codePoints method yields a stream of int values one for each code point
        int[] codePoints = str.codePoints().toArray();
        System.out.println("codePoints: " + codePoints);
        System.out.println("codePoints: " + Arrays.toString(codePoints));
        System.out.println("codePoints: " + Arrays.toString(str.codePoints().toArray()));
        // Unicode
        String javatm = "Java\u2122";
        System.out.println(javatm);
        System.out.println(Arrays.toString(javatm.codePoints().toArray()));
        System.out.println(javatm.length());

        String octonions = "\ud835\udd46";
        System.out.println(octonions);
        System.out.println(Arrays.toString(octonions.codePoints().toArray()));
        System.out.println(octonions.length()); // Counts code units, not Unicode code points
    }
}
