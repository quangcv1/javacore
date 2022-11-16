package ch04_inheritance_reflection.s02_Inheritance_hierarchies.managers;

import ch04_inheritance_reflection.s02_Inheritance_hierarchies.employees.Employee;

/**
 *
 */
public class Manager extends Employee {

    int bonus = 100;

//    public Manager(double salary, int bonus) {
//        super(salary);
//        this.bonus = bonus;
//    }

//    public Manager(int bonus) {
//        this.bonus = bonus;
//    }

    public Manager() {

    }

    @Override
    public double getSalary() {
        return this.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                ", salary=" + salary +
                '}';
    }
}
