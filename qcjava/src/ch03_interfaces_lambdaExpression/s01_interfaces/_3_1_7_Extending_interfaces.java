package ch03_interfaces_lambdaExpression.s01_interfaces;

/**
 * @see <a href="https://learning.oreilly.com/library/view/core-java-for/9780138051846/ch03.xhtml#sec3_1">3.1.7</a>
 * @description: An interface can extend another, requiring or providing additional methods on top of the original ones. For example, Closeable is an interface with a single method:
 * @code: <code>public interface Closeable {
 *     void close();
 * }</code>
 * @note: the Channel interface extends this interface
 * @code: <code>public interface Channel extends Closeable {
 *     boolean isOpen();
 * }</code>
 */
public class _3_1_7_Extending_interfaces {
}
