package ch02_Obj_Oriented_Programming._5_Static_var_and_methods;

/**
 * @static_constants: static final. Ex: Math.PI = 3.14
 * @note: static final could be an object not a number
 * public class Employee {
 *     private static final Random generator = new Random();
 *     private int id;
 *     ...
 *     public Employee() {
 *         id = 1 + generator.nextInt(1_000_000);
 *     }
 * }
 * It is both wasteful and insecure to construct a new random number generator each time you want a random number. U r better off sharing a single generator among all instances of a class
 * @another_ex:
 * public class System {
 *     public static final PrintStream out;
 *     ...
 * }
 */
public class _5_2_Static_constants {
}
