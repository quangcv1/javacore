package ch03_interfaces_lambdaExpression.s05_Method_Constructor_references;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * @constructor_references: like method references, except that the name of the method is "new". Ex: Employee::new is a reference to an "Employee" constructor. If the class has more than one constructor, then it depends on the context which constructor is chosen.
 */
public class _5_2_Constructor_references {
    public static void main(String[] args) {
        var names = List.of("Peter","Paul","Mary");
        //Error here with ImmutableCollections => names is immutable so we can't sort it
//        Collections.sort(names);
//        System.out.println(names);
        //Create employees with above names
        Stream<Employee> stream = names.stream().map(Employee::new);
        //It is not possible to construct an array of a generic type. For that reason, methods such as Stream.toArray return an Object array, not an array of the element type
//        Object[] employees = stream.toArray();
//        System.out.println(Arrays.toString(Arrays.stream(employees).toArray()));

        //The user wants an array of employees, not objs. To solve this problem, another version of toArray accepts a constructor reference.
        Employee[] staffs = stream.toArray(Employee[]::new);//form constructor references with array types Employee
        System.out.println(Arrays.toString(staffs));
        for (Employee e : staffs) System.out.println(e.getName());

    }
}
