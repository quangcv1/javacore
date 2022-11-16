package ch03_interfaces_lambdaExpression.s08_higher_order_functions;

import java.util.Arrays;
import java.util.Comparator;

public class _8_2_methods_that_modify_functions {
    public static Comparator<String> compareInDirection(int direction) {
        return (x,y) -> direction * x.compareTo(y); //x is String class and String class impl the Comparable interface so it can use compareTo method
    }

    /**
     *
     * @param comp - receive a function
     * @return: a modified function
     */
    public static Comparator<String> reverse(Comparator<String> comp) {
        return (x,y) -> -comp.compare(x,y); //Comparator interface has a method compare(x,y)
    }

    public static void main(String[] args) {
        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Arrays.sort(words,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(words));
        Arrays.sort(words,reverse(String::compareToIgnoreCase));
        System.out.println(Arrays.toString(words));
        Arrays.sort(words,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(words));
        Arrays.sort(words,Comparator.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
