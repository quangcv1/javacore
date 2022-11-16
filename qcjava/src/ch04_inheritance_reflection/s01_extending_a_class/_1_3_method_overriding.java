package ch04_inheritance_reflection.s01_extending_a_class;

/**
 * @method_overriding: when superclass (Employee) method needs to be modified in a subclass (Manager). Ex: suppose that the getSalary() method => u need to override the method so that it returns the sum of the base salary and the bonus
 * @see ch04_inheritance_reflection.s01_extending_a_class.Manager Manager (subclass)
 * @see ch04_inheritance_reflection.s01_extending_a_class.Employee Employee (superclass)
 * @code: <pre>{@code
 * public class Manager extends Employee {
 *     ...
 *     public double getSalary() { // Overrides superclass method
 *         return super.getSalary() + bonus;
 *     }
 * }
 * }</pre>
 * @note: subclass method cannot access the private instance variables of the superclass directly. This is why the "Manager.getSalary" method calls the public Employee.getSalary method. The super keyword is used for invoking a superclass method
 */
public class _1_3_method_overriding extends Employee{
    public _1_3_method_overriding(String name, double salary) {
        super(name, salary);
    }

    //not override
    //because we change the parameter. with override, we cannot change the parameter type
//    @Override
//    public double getSalary(int bonus) {
//        return super.getSalary();
//    }

    //override


    //Method does not override method from its superclass
//    @Override
//    public boolean worksFor(Manager supervisor) {
//        return super.worksFor(supervisor);
//    }

//    @Override
//    public boolean worksFor(Employee supervisor) {
//        return super.worksFor(supervisor);
//    }

    //not override it's an another method to worksFor method in Employee class
    public boolean worksFor(Manager supervisor) {
        return false;
    }

    @Override
    public Manager getSupervisor() {
//        return (Manager) super.getSupervisor();
        return new Manager("quang", 10000);
    }

    public static void main(String[] args) {
        _1_3_method_overriding test = new _1_3_method_overriding("Quang",5000);
        Manager manager = new Manager("Thuy",3000);
        System.out.println(test.worksFor(manager));
        System.out.println(test.getSupervisor().toString());
    }
}
