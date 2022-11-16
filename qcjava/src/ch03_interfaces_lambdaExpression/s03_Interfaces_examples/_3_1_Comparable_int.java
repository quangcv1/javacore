package ch03_interfaces_lambdaExpression.s03_Interfaces_examples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Comparable_interface: String class, as well as over a hundred other classes in the java lib, implements the Comparable interface => u can use the Arrays.sort method to sort an array of Comparable objs.
 * @Comparable_interface: with method compareTo need to implement
 * @see ch03_interfaces_lambdaExpression.s03_Interfaces_examples.Employee
 */

public class _3_1_Comparable_int {
    public static void main(String[] args) {
        //Check with String Array
        String[] names = {"Peter", "Paul","Mary"};
        System.out.println(names);
        Arrays.sort(names);//Arrays is util for Array
        System.out.println(Arrays.toString(names));

        //Check with ArrayList
        ArrayList<String> names1 = new ArrayList<String>(List.of("Quang", "Minh","Thuy"));
        Collections.sort(names1);//Collections is util for ArrayList
        System.out.println(names1);

        //Check with Employee obj with arrays
        Employee quang = new Employee("quang", 8000);
        Employee thuy = new Employee("thuy",2000);
        Employee minh = new Employee("minh", 0);
        Employee[] employees = {quang,thuy,minh};
        System.out.println(Arrays.toString(employees));
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));

        //Check with Employee obj with ArrayList
        ArrayList<Employee> employees1 = new ArrayList<>(List.of(quang,thuy,minh));
        System.out.println(employees1);
        Collections.sort(employees1);
        System.out.println(employees1);
    }
}
