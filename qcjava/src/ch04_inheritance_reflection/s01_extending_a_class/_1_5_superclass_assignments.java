package ch04_inheritance_reflection.s01_extending_a_class;

/**
 * @superclass_assignment: it is legal to assign an object from a subclass to a variable whose type is a superclass.
 * @code:
 * <pre>{@code
 * Manager boss = new Manager(...);
 * Employee empl = boss; // OK to assign to superclass variable
 * }
 * </pre>
 * @caution:
 * <pre>{@code
 * Manager[] bosses = new Manager[10];
 * Employee[] empls = bosses; // Legal in Java
 * empls[0] = new Employee(...); // Runtime error
 * }</pre>
 * because: empls[] refer to Manager obj not employee with error {@code ArrayStoreException}
 */
public class _1_5_superclass_assignments {
    public static void main(String[] args) {
        Manager boss = new Manager("Quang", 10000);
        Employee empl = boss;
        //empl and boss refer to the same obj {Quang, 10000}
        System.out.println(boss == empl);

        //check when invoke a method on the superclass variable
        //empl.getSalary = boss.getSalary because empl is referring to boss (manager subclass) obj
        boss.setBonus(1000);
        System.out.println(empl.getSalary());//11000

        //but u can use the empl.setBonus because empl type is Employee and Employee type doesn't have setBonus() method

        //WHY WOULD WE WANT TO ASSIGN A MANAGER OBJ TO AN EMPLOYEE VAR ?
        //CHECK THIS CASE
        //Calculate total salary of all employees including managers
        Employee[] staff = new Employee[2];
        staff[0] = new Employee("Thuy",3000);
        //how we can setBonus initialization for staff[1]
        //use anonymous subclass
        //the outer braces make an anonymous subclass of Manager.
        //the inner braces are an initialization block
        staff[1] = new Manager("Quang",10000) {
            {
                setBonus(3000);
            }
        };

        double total = 0;
        System.out.println(staff[1].getSalary());
        for(Employee emp : staff) {
            total += emp.getSalary();
        }
        System.out.println("Total is: " + total);

        //CAUTION
        Manager[] bosses = new Manager[2];
        Employee[] empls = bosses; //legal in Java
        //empls[0] = new Employee("Thuy", 3000); //Runtime Error with ArrayStoreException
        //System.out.println(empls[0].getName());
    }
}
