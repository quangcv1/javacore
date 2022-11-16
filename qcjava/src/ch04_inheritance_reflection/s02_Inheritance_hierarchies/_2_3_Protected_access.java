package ch04_inheritance_reflection.s02_Inheritance_hierarchies;

import ch04_inheritance_reflection.s02_Inheritance_hierarchies.employees.Employee;
import ch04_inheritance_reflection.s02_Inheritance_hierarchies.managers.Manager;

/**
 * @protected_access: when u want to restrict a method to subclass only or, less commonly, to allow subclass methods to access an instance variable of a superclass. For that declare a class feature as protected
 * @protected_method: for example, suppose the superclass Employee declares the instance variable salary as protected instead of private
 * <pre>{@code
 * package com.horstmann.employees;
 *
 * public class Employee {
 *     protected double salary;
 *     ...
 * }
 * }</pre>
 * All classes in the same package as Employee can access this field. Now consider a subclass from a different package
 * <pre>{@code
 * package com.horstmann.managers;
 *
 * import com.horstmann.employees.Employee;
 *
 * public class Manager extends Employee {
 *     ...
 *     public double getSalary() {
 *         return salary + bonus; // OK to access protected salary variable
 *     }
 * }
 * }</pre>
 * @see ch04_inheritance_reflection.s02_Inheritance_hierarchies.employees.Employee Employee-superclass with protected variable double salary
 * @see ch04_inheritance_reflection.s02_Inheritance_hierarchies.managers.Manager Manager-subclass from different package still can access protected variable
 * @usecase: protected methods and constructors are more common. For example, the "clone" method of the "Object" class is protected since it is somewhat tricky to use (see 4.3.4 "Cloning Objects")
 * @see <a href="https://learning.oreilly.com/library/view/core-java-for/9780138051846/ch04.xhtml#sec4_2">reference</a>
 */

public class _2_3_Protected_access {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        System.out.println(m1);

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        System.out.println(e1);
        e1.setSalary(20);
        //even we change salary of e1 still m1 and e2 using protected double salary but still not change
        System.out.println(e1);
        System.out.println(m1);
        System.out.println(e2);
    }
}
