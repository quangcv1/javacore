package ch03_interfaces_lambdaExpression.s03_Interfaces_examples;

/**
 * @descriptiong: 3.3.1
 * @implement: Comparable
 * @Comparable-int: String class, as well as over a hundred other classes in the java lib, implements the Comparable interface => u can use the Arrays.sort method to sort an array of Comparable objs.
 * @String: int compareTo(String other)
 */
public class Employee implements Comparable<Employee> {
    @Override
    public int compareTo(Employee o) {
        //Returning a difference of integers/double does not always work. The difference can overflow for large operands of opposite sign.
        //Use Integer.compare/ Double.compare
        //return Double.compare(salary, o.salary); //compare based on salary
        return this.name.compareTo(o.name); //compare based on name
    }
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this.name = "";
        this.salary = salary;
    }

    public Employee(String name) {
        //salary automatically set to zero
        this.name = name;
    }
    public Employee() {this("",0);}

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        StringBuilder result = new StringBuilder(name);
        result.append(" with salary: ");
        result.append(salary);
        return result.toString();
    }

}
