package ch02_Obj_Oriented_Programming._5_Static_var_and_methods;

/**
 * @static-variable-vs-not_static: then there is only one such variable per class. Not-static, in contrast, each obj has its own copy of an instance variable.
 */

public class Employee {
    private  static int lastId = 0;
    private int id;
    private String name;
    private double salary;

    //suppose we want to give each employee a distinct ID number. Then we can share the lastID that was given out
    public Employee() {
        lastId++; //shared this static variable with increase
        id = lastId;//then assign to id (own instance variable)
    }

    public Employee(String name, double salary) {
        this();
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getName() { return name;}
    public double getSalary() { return salary; }
    public int getId() { return id; }
}
