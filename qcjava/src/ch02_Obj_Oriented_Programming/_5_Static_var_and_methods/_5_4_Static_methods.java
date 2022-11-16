package ch02_Obj_Oriented_Programming._5_Static_var_and_methods;

/**
 * @static-methods: are methods that do not operate on objs.
 */
public class _5_4_Static_methods {

    public static void main(String[] args) {
        //demo static methods with RandomNumbers class
        int dieToss = RandomNumbers.nextInt(1,6); //static method from RandomNumbers class
        System.out.println(dieToss);

    }
}
