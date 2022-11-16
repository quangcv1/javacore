package ch03_interfaces_lambdaExpression.s01_interfaces;

/**
 * @description: any var defined in an interface is automatically "public static final"
 * @ex: <code>
 *     public interface SwingConstants {
 *     int NORTH = 1;
 *     int NORTH_EAST = 2;
 *     int EAST = 3;
 *     ...
 * }
 * </code>
 * @refer: SwingConstants.NORTH. If your class chooses to impl the SwingConstants interface, u can drop the SwingConstants qualifier and simply write NORTH. However, this is not a common idiom. It is far better to use enumerations for a set of constants.
 * @note: u can't have instance variables in an interface. An interface specifies behavior, not object state.
 */
public class _3_1_9_Constants {
}
