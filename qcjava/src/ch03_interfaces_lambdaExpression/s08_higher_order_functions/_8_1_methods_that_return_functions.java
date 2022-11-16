package ch03_interfaces_lambdaExpression.s08_higher_order_functions;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @higher-order_functions: functions that process or return functions are called higher-order functions
 * @usecase: suppose we want to sort an array of strings in ascending order and other times in descending order. We can make a method that produces the correct comparator.
 */
public class _8_1_methods_that_return_functions {
    //want to sort an array of strings in ascending order and other times in descending order
    public static Comparator<String> compareInDirection(int direction) {
        return (x,y) -> direction * x.compareTo(y);// or x.compareToIgnoreCase(y)
    }


    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Arrays.sort(words);//compareTo also do with capital chars => Mary != mary
        System.out.println(Arrays.toString(words));
        Arrays.sort(words,compareInDirection(1));
        System.out.println(Arrays.toString(words));
        Arrays.sort(words,compareInDirection(-1));
        System.out.println(Arrays.toString(words));
    }
}
