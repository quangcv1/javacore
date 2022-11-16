package ch03_interfaces_lambdaExpression.s05_Method_Constructor_references;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this(name,0);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
