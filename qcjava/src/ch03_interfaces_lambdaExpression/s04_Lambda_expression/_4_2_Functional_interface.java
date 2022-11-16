package ch03_interfaces_lambdaExpression.s04_Lambda_expression;

/**
 * @functional_interface: an interface with a single abstract method is expected. Such an interface is called a functional interface
 * @description: may interfaces in java that express actions, such as Runnable or Comparator. Lambda expressions are compatible with these interfaces
 * @usecase: u can supply a lambda expression whenever an obj of an interface with a single abstract method is expected.
 * @note: java api provides a large number of functional interfaces. One of them is
 * <pre>
 * public interface Predicate<T> {
 *     boolean test(T t);
 *     // Additional default and static methods
 * }
 * </pre>
 * @ex: ArrayList class has a removeIf method whose para is a Predicate. It is specifically designed for receiving a lambda expression.
 * <pre>
 *     list.removeIf(e -> e == null);
 * </pre>
 */
public class _4_2_Functional_interface {
}
