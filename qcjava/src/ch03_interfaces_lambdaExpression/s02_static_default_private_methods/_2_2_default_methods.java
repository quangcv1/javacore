package ch03_interfaces_lambdaExpression.s02_static_default_private_methods;

/**
 * @description: u can supply a default impl for any interface method.
 * @code:
 * <pre>
 * public interface IntSequence {
 *     default boolean hasNext() { return true; }
 *         // By default, sequences are infinite
 *     int next();
 * }
 * </pre>
 * @note: a class implementing this interface can choose to override the hasNext method or inherit the default impl
 * @see IntSequence
 */
public class _2_2_default_methods {
    public static void main(String[] args) {

    }
}
