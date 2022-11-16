package ch03_interfaces_lambdaExpression.s06_Processing_lambda_expressions;

import java.util.Arrays;
import java.util.function.IntConsumer;

/**
 * @deferred_execution: is one of the point of using lambdas.
 * @reasons_for_executing_code_later:
 * <li>Running the code in a separate thread</li>
 * <li>Running the code multiple times</li>
 * <li>Running the code at the right point in an algorithm(ex: the comparison operation in sorting</li>
 * <li>Running the code when sth happens (a button was clicked, data has arrived, and so on</li>
 * <li>Running the code only when necessary</li>
 * @note: to accept the lambda, we need to pick (or, in rare cases, provide) a functional interface. Ex: can use Runnable, IntConsumer
 * @IntConsumer-functional-interface:
 * <pre>
 * public interface IntConsumer {
 *     void accept(int value);
 * }
 * </pre>
 */

public class _6_1_Impl_deferred_execution {
    public static void repeat(int n, Runnable action) {
        for (int i = 0; i < n; i++) {
            action.run();
        }
    }
    //Standard interface for processing int values is IntConsumer
    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) {
            action.accept(i);
        }
    }

    public static void main(String[] args) {
        repeat(10,() -> System.out.println("Hello, World!"));
        repeat(10,i -> System.out.println(i)); // == repeat(10,System.out::println)
        //if only repeat(int n, IntConsumer action) is declared

        //The static Arrays.setAll method applies an IntFunction to all elements of an array, setting each element with the result
        var squares = new int[10];
        Arrays.setAll(squares,index -> index*index);
        System.out.println(Arrays.toString(squares));
    }
}
