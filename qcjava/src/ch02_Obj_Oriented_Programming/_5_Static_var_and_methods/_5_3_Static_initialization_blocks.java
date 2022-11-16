package ch02_Obj_Oriented_Programming._5_Static_var_and_methods;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @description: sometimes, you need to do additional initialization work => can put it into a static initialization block.
 * @static-initialzation: occurs when the class is first loaded.
 * @static-variable-initializations_&_static_initialization_blocks: are executed in the order in which they occur in the class declaration
 */

public class _5_3_Static_initialization_blocks {
    private static final ArrayList<Integer> expirationYear = new ArrayList<>();
    static {
        // Add the next 20 years to the array list
        int year = LocalDate.now().getYear();
        for (int i = year; i < 20; i++) {
            expirationYear.add(i);
        }
    }
    //....
    public static void main(String[] args) {
        System.out.println(expirationYear);//not work
    }

}
