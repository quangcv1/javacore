package ch02_Obj_Oriented_Programming._5_Static_var_and_methods;

import java.util.Random;

/**
 * @ex_for_5_4
 * @static_method: common reason is to provide added functionality to classes that u don't own
 * @note: you can't access instance variables from a static method. But, static methods can access the static variables in their class.
 */
public class RandomNumbers {
    //Add a method to the RandomNumbers class with purpose:
    //to have a method that yields a random integer in a given range (low, high)
    private static Random generator = new Random(); //static variable
    //static methods
    public static int nextInt(int low, int high) {
        //static method can access static variable
        return low + generator.nextInt(high - low + 1);
    }
}
