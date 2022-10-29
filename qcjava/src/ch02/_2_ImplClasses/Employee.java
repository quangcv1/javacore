package ch02._2_ImplClasses;

/**
 * @private: only methods of the same class can access them
 * @ex: you might store the employees in a database and only leave the primary key in the obj. As long as you reimplement the methods, so they work the same as before the users of your class won't care
 * @instance_variable: some languages, instance variables are decorated in some way, ex: _name and _salary. This is legal in Java but is not commonly done
 */
public class Employee {
    private String name; //instance variable
    private double salary; //instance variable

    //constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent/100;
        salary += raise;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    //normal way
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //declare this as a para of any method but not a constructor
    public void setSalary1(Employee this, double salary) {
        this.salary = salary;
    }
}
