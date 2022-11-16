package ch02_Obj_Oriented_Programming._5_Static_var_and_methods;

import java.text.NumberFormat;

/**
 * @factory_method: a static method that returns new instances of the class. Ex: the NumberFormat class uses factory methods that yield formatter objs for various styles
 * @note: factory method can also return a shared obj, instead of unnecessarily constructing new ones. Ex: the call Collections.emptyList() returns a shared immutable empty list.
 */

public class _5_5_Factory_method {
    public static void main(String[] args) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x));//Prints $0.10
        System.out.println(percentFormatter.format(x));// prints 10%
    }
}
