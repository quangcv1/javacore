package ch03_interfaces_lambdaExpression.s05_Method_Constructor_references;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @method_reference: is shorter than a lambda expression calling the method
 * @usecase:
 * <li>Class::instanceMethod</li>
 * <li>Class::staticMethod</li>
 * <li>Object::instanceMethod</li>
 * @Class::instanceMethod == String::compareToIgnoreCase == (x,y) -> x.compareToIgnoreCase(y). First para is receiver(x) and any other paras are passed to the method
 * @Class::staticMethod == Objects::isNull == x -> Objects.isNull(x). All paras are passed to the static method
 * @object::instanceMethod == System.out::println == x -> System.out.println(x). The method is invoked on the given object, and the parameters are passed to the instance method.
 * @note: this::equals == x -> this.equals(x)
 * @inner-class: u can capture this reference of an enclosing class as EnclosingClass.this::method. U can also capture super, see Chapter 4
 */



public class _5_1_Method_references {
    public static void main(String[] args) {
        String[] strings = {"Mary", "had", "a", "little", "lamb"};
        //Class:instanceMethod
        Arrays.sort(strings,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strings));

        var enemies = new ArrayList<String>(List.of("Malfoy","Crabbe","Goyle"));
        //add null here if not then error with NullPointerException
        enemies.add(null);
        System.out.println(enemies);
        //Class::staticMethod
        enemies.removeIf(Objects::isNull);
        System.out.println(enemies);

        //object::instanceMethod
        //note: there are multiple overloaded methods of the println method.
        //when passed to the forEach method of an ArrayList<String>, the println(String) method is picked
        enemies.forEach(System.out::println);
    }
}
