package ch04_inheritance_reflection.s01_extending_a_class;

/**
 * @keyword: extends indicates that u are making a new class that derives from an existing class
 * @superclass: the existing class => "Employee" is the superclass
 * @subclass: "Manager" is the subclass.
 */
public class Manager extends Employee{
    //added fields
    private double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    //added methods
    public void setBonus(double bonus) {this.bonus = bonus;}

    //added overriding methods
//    public double getSalary() {
//        return super.getSalary() + bonus;
//    }

    //added overiding methods
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "name: " + super.getName() + " and salary: " + getSalary();
    }
}
