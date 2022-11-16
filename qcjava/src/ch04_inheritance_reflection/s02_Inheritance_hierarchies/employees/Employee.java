package ch04_inheritance_reflection.s02_Inheritance_hierarchies.employees;

public class Employee {
    protected double salary = 10;

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee() {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
