package ch03_interfaces_lambdaExpression.s08_higher_order_functions;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;

/**
 *Comparator interface has a number of useful static methods that are higher order functions generating comparators.
 *
 */
public class _8_3_comparator_methods {
    public static void main(String[] args) {
        Person[] people = {
                new Person("George", "Washington"),
                new Person("John", "Adams"),
                new Person("Thomas", "Jefferson"),
                new Person("James", "Madison"),
                new Person("James", "Monroe"),
                new Person("John", "Quincy", "Adams"),
                new Person("Andrew", "Jackson"),
                new Person("Martin", "van Buren"),
                new Person("William", "Henry", "Harrison"),
                new Person("John", "Tyler"),
                new Person("James", "Knox", "Polk"),
                new Person("Zachary", "Taylor"),
                new Person("Millard", "Fillmore"),
                new Person("Franklin", "Pierce"),
                new Person("James", "Buchanan"),
                new Person("Abraham", "Lincoln"),
                new Person("Andrew", "Johnson"),
                new Person("Ulysses", "S.", "Grant"),
                new Person("Rutherford", "Birchard", "Hayes"),
                new Person("James", "Abram", "Garfield"),
                new Person("Grover", "Cleveland"),
                new Person("Benjamin", "Harrison"),
                new Person("Grover", "Cleveland"),
                new Person("William", "McKinley"),
                new Person("Theodore", "Roosevelt"),
                new Person("William", "Howard", "Taft"),
                new Person("Woodrow", "Wilson"),
                new Person("Warren", "Gamaliel", "Harding"),
                new Person("Calvin", "Coolidge"),
                new Person("Herbert", "Hoover"),
                new Person("Franklin", "Delano", "Roosevelt"),
                new Person("Harry", "S.", "Truman"),
                new Person("Dwight", "David", "Eisenhower"),
                new Person("John", "Fitzgerald", "Kennedy"),
                new Person("Lyndon", "Baines", "Johnson"),
                new Person("Richard", "Mulhouse", "Nixon"),
                new Person("Gerald", "Ford"),
                new Person("James", "Earl", "Carter"),
                new Person("Ronald", "Reagan"),
                new Person("George", "Herbert Walker", "Bush"),
                new Person("William", "Jefferson", "Clinton"),
                new Person("George", "Walker", "Bush"),
                new Person("Barack", "Hussein", "Obama")
        };
        /**
         * Comparing method
         * @param: "key extractor" function that map a type T to a comparable type (such as String). The function is applied to the objs to be compared.
         * @return: return keys.
         * @example: a Person class has a method getLastName, then u can sort an array of Person objs by last name
         */
        Arrays.sort(people, Comparator.comparing(Person::getName));
        System.out.println(Arrays.toString(people));

        /**
         * thenComparing method
         * @usecase: u can chain comparators with the thenComparing method to break ties
         * @ex: sort an array of people by last name, then use the first name for people with the same last name.
         */
        Arrays.sort(people,
                Comparator
                        .comparing(Person::getLastName)
                        .thenComparing(Person::getFirstName)
        );
        System.out.println(Arrays.toString(people));

        Arrays.sort(
                people,
                Comparator.comparing(Person::getLastName,
                        (s,t) -> s.length() - t.length()
                        )
        );
        System.out.println(Arrays.toString(people));

        Arrays.sort(people,
                comparingInt(p -> p.getName().length())
                );
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, comparing(Person::getMiddleName,
                nullsFirst(naturalOrder())));
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, comparing(Person::getName,
                reverseOrder()));
        System.out.println(Arrays.toString(people));
    }
}
