package ch01_Fundamental;

/**
 * @Types: float, double
 * @Suffix: F
 * @Double.POSSITIVE_INFINITY: vo cuc (ex: 1.0/0.0)
 * @Double.NEGATIVE_INFINITIVE: - vo cuc
 * @Double.NaN: not a number ex: 1.0/0.0
 * @Double.isNaN(x): check for NaN
 * @Double.isInfinite: check for +- vô cực
 * @Double.isFinite: check for floating point number is neither infinite nor a NAN
 */

public class _2_2_FloatingTypes {
    public static void main(String[] args) {

        System.out.println(3.14F); // float literal
        System.out.println(3.14); // double literal
        System.out.println(3.14D); // double literal
        System.out.println(0x1.0p-3); // hex double literal

        // Infinity and NaN
        System.out.println("POSITIVE_INFINITY: ");
        System.out.println(1.0 / 0.0);
        System.out.println(1.0 / 0.0 == Double.POSITIVE_INFINITY);
        System.out.println(Double.isFinite(0.0 / 0.0));
        System.out.println(Double.isInfinite(1.0 / 0.0));

        System.out.println("NEGATIVE_INFINITY: ");
        System.out.println(-1.0 / 0.0);
        System.out.println(-1.0 / 0.0 == Double.NEGATIVE_INFINITY);
        System.out.println(Double.isFinite(0.0 / 0.0));
        System.out.println(Double.isInfinite(1.0 / 0.0));

        System.out.println("NaN: ");
        System.out.println(0.0 / 0.0);
        System.out.println(0.0 / 0.0 == Double.NaN);
        System.out.println(Double.isNaN(0.0 / 0.0));








        System.out.println("NaN check");
        System.out.println(0.0 / 0.0 == Double.NaN);
        System.out.println(Double.isNaN(0.0/0.0));

        // Roundoff error
        // Such roundoff errors are caused by the fact that floating-point numbers are represented in the binary number system. There is no precise binary representation of the fraction 3/10, just as there is no accurate representation of the fraction 1/3 in the decimal system. If you need precise numerical computations with arbitrary precision and without roundoff errors, use the BigDecimal class
        System.out.println(2.0 - 1.1); //0.89999999999999999999 not 0.9
    }
}
