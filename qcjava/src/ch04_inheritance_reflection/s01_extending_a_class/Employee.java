package ch04_inheritance_reflection.s01_extending_a_class;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary*byPercent/100;
        salary += raise;
    }
    public final String getName() {return name;}
    public double getSalary() {return salary;}

    //check for override with change para
    public boolean worksFor(Employee supervisor) {
        return true;
    }

    //check for override with change return type
    public Employee getSupervisor() {
        return new Employee("quang", 8000);
    }
}
