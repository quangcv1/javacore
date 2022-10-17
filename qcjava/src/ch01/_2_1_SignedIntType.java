package ch01;

/**
 * @Types: Byte, Short, Int, Long
 */
public class _2_1_SignedIntType {
    public static void main(String[] args) {
        // BYTE 1 byte = 8 bit
        System.out.println("BYTE max: " + Byte.MAX_VALUE + " and min: " + Byte.MIN_VALUE);

        // SHORT 2 bytes = 16 bit
        System.out.println("SHORT max: " + Short.MAX_VALUE + " and min: " + Short.MIN_VALUE);

        // INT 4 bytes = 32 bit
        System.out.println("INT max: " + Integer.MAX_VALUE + " and min: " + Integer.MIN_VALUE);

        // LONG 8 bytes = 64 bit
        System.out.println("LONG max: " + Long.MAX_VALUE + " and min: " + Long.MIN_VALUE);

        //Literals with a suffix not for byte and short
        System.out.println("LONG 4000000000000L is: " + 400000000000L);
        // 0 for octal prefix
        System.out.println("Octal number 011: " + 011);
        // 0b for binary
        System.out.println("Binary with _: 0b1111_0100_0010_0100_0000" + 0b1111_01000_0010_0100_0000);

        //unsigned value with automation cast
        Short s = 255;
        System.out.println("Short: " + s );
        System.out.println("Short: " + Short.toUnsignedInt(s)); //get an int val between 0 and 255
    }
}
