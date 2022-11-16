package ch03_interfaces_lambdaExpression.s04_Lambda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @lambda_expression: is a block of code that u can pass around so it can be executed later, once or multiple times
 * @preceeding_usecase:
 * <li>To pass a comparison method to Arrays.sort</li>
 * <li>To run a task in a separate thread</li>
 * <li>To specify an action that should happen when a button is clicked</li>
 * @note: Java is an object-oriented language where everything is an obj. There no function types in Java. Instead, functions are expressed as objs, instances of classes that implement a particular interface.
 * @note: Lambda expressions give you a convenient syntax for creating such instances
 */

public class _4_1_Lambda_expression_syntax {


    public static void main(String[] args) {
        //the old one
        String[] friends = {"Quang", "Thuy", "Minh"};
        Comparator<String> comp = (first, second) -> first.length() - second.length();
        Arrays.sort(friends,comp);
        System.out.println(Arrays.toString(friends));

        //the short way
        String[] friends2 = {"Quang","Thuy","Minh"};
        Arrays.sort(friends2, (first,second) -> first.length() - second.length() == 0 ? first.compareTo(second) : first.length() - second.length());
        System.out.println(Arrays.toString(friends2));

        //the complex way
        String[] friends3 = {"Quang","Thuy","Minh"};
        Arrays.sort(friends3, (first,second) -> {
            return first.length() - second.length() == 0 ? first.compareTo(second) : first.length() - second.length();
        });
        System.out.println(Arrays.toString(friends2));

        //remove with lambda expression
//        var enemies = new ArrayList<String>(List.of("Malfoy", "Crabbe", "Goyle", null));// NullPointerException error
//        enemies.removeIf(e -> e == null);
        var enemies = new ArrayList<String>(List.of("Malfoy", "Crabbe", "Goyle", ""));
        enemies.removeIf(e -> e == "");
        System.out.println(enemies);
        //remove with lambda expression array
        String[] enemies1 = {"Malfoy", "Crabbe", "Goyle",null};
        var test = Arrays.stream(enemies1).filter(e -> e == "Malfoy");
        System.out.println(Arrays.toString(test.toArray()));
    }
}
