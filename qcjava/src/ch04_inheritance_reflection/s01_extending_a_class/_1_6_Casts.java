package ch04_inheritance_reflection.s01_extending_a_class;

/**
 * @Cast: empl of type Employee can refer to objs whose class is Employee, Manager, or another subclass of Employee.
 * @pros: useful for code that deals with objs from multiple classes.
 * @drawback: u can only invoke methods that belong to the superclass "Employee" from empl variable
 * @ex:
 * <pre>{@code
 * Employee empl = new Manager(...);
 * empl.setBonus(10000); // Compile-time error
 * }</pre>
 * @solution
 * <li>Use anonymous class with initialization block - check 1.5</li>
 * <li>use cast</li>
 * <pre>{@code
 * if (empl instanceof Manager mgr) {
 *     mgr.setBonus(10000);
 * }
 * }</pre>
 * @instanceof: as with interfaces, u can use the instanceof operator and a cast to turn a superclass reference to a subclass
 */
public class _1_6_Casts {
    public static void main(String[] args) {
        Employee[] staff = new Employee[2];
        staff[0] = new Employee("Thuy",3000);
        staff[1] = new Manager("Quang",10000);
        if(staff[1] instanceof Manager mgr) {
            System.out.println(staff[1] instanceof Manager);
            mgr.setBonus(3000);
        }
        System.out.println(staff[1].getSalary());
        double sum = 0;
        for(Employee emp : staff) {
            sum += emp.getSalary();
        }
        System.out.println(sum);
    }
}
