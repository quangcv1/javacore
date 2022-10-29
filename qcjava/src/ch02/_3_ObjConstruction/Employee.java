package ch02._3_ObjConstruction;

import java.util.Random;

/**
 * @constructor: name is the same as the class name, & there is no return type. The constructor is public
 * @new-operator: the constructor executes when you use the new operator.
 * @constructor-with-no-arguments: creates an obj whose state is set to an appropriate default
 * @private-vs-public_constructor: private constructor also be useful. Ex: the LocalDate class has no public constructors. Instead, users of the class obtain objects from "factory methods" such as now and of. These methods call a private constructor.
 * @overload: if there are multiple versions with the same name but different parameters: Ex: overloaded versions of the println method with paras int, double, String, and so on.
 * @one_constructor-from-another_constructor
 * @default_initialization
 * @instance_variable_initialization
 * @initialization_instance_variable: occurs after the obj has been allocated and before a constructor runs. Therefor, the initial value is present in all constructor. But we can still overwrite it if we need.
 * @final_instance_variable: a variable must be initialized by the end of every constructor. Ex: id variable of the Employee class declared as final because it never changes after the obj is constructed - there is no setId method
 * @final_instance_variable-with-a-reference: the final modifier merely states that the reference will never change. It is perfectly legal to mutate the obj
 * @ex:
 * public class Person {
 *     private final ArrayList<Person> friends = new ArrayList<>();
 *         // OK to add elements to this array list
 *     ...
 * }
 */
public class Employee {
    private  String name = "";//instance variable initialization
    private double salary;
    private final int id;//need to initialize id

    //arbitrary initialization block for id
    //should place lengthy initialization code into a helper method and invoke that method from the constructor.
    {
        var generator = new Random();
        id = 1 + generator.nextInt(1_000_000);
    }
    //constructor1
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //overloading - constructor2 with default name = ""
    //overloading - one constructor from another
    //put common initialization into one constructor
    public Employee(double salary) {
        //name already set to "" when declare
        //this.name = "";
        //this.salary = salary;
        this("", salary);
    }
    //default initialization
    public Employee(String name) {
        //salary automatically set to zero
        this.name = name;
    }

    //constructor with no arguments
    //use keyword this
    public Employee() {
//        name = "";
//        salary = 0;
        this("",0);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary*byPercent/100;
        salary += raise;
    }

    public String getName() {return name;}
    public double getSalary() {return salary;}
    public int getId() {return id;}
}
