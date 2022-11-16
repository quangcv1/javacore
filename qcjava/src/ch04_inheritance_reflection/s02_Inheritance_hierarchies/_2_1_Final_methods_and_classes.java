package ch04_inheritance_reflection.s02_Inheritance_hierarchies;

/**
 * @final_methods: when u declare a method as final, no subclass can override it
 * <pre>{@code
 * public class Employee {
 *     ...
 *     public final String getName() {
 *         return name;
 *     }
 * }
 * }</pre>
 * @ex_final_methods: in the Java API is the getClass() method of the Object class.
 * @why_getClass_is_final: it does not seem wise to allow objects to lie about the class to which they belong, so this method can never be changed => final
 * @final_classes: to prevent someone from forming a subclass from one of your class. Use the final modifier in the class definition to indicate this.
 * here is how to prevent others from subclassing the Executive class: <pre>{@code
 * public final class Executive extends Manager {
 *     ...
 * }
 * }</pre>
 * @ex_final_classes: in the Java API, such as String, LocalTime, and URL
 */

public class _2_1_Final_methods_and_classes {
}
