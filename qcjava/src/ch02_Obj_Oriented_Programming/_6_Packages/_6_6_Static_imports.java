package ch02_Obj_Oriented_Programming._6_Packages;
import static java.lang.Math.*;
//import a specific static method or variable
//import static java.lang.Math.PI;
//import static java.lang.Math.pow;

/**
 * @static_import: a form of import statement permits the importing of static methods and variables.
 * @static_import-vs-import: import lets you use classes without the fully qualified name.
 * @import-all-classes-with-a-wildcard: import java.util.* => import classes, not packages
 * @conflict-name: import java.util.* vs import java.sql.* both have Date class => fix: import java.sql.Date;
 */
public class _6_6_Static_imports {
    public static void main(String[] args) {
        double r = 10;
        double area = 4 * PI * pow(r,2);
        System.out.println(area);
    }
}
