package ch01;

/**
 * @char: "code units" in the UTF-16 character encoding used by Java
 * @backslash: to escape a single quote
 * @backslash: '\\'
 */
public class _2_3_CharType {
    public static void main(String[] args) {
        //@character-literals: 'J' is a character literal with value 74 (4A)
        System.out.println('J');
        System.out.println('J' == 74);

        System.out.println('\u004A');

        //@examples-2: "U+263A White Smiling Face" == '\u263A' = '☺'
        System.out.println('\u263A');
    }
}
