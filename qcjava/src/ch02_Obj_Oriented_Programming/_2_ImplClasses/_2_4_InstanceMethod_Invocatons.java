package ch02_Obj_Oriented_Programming._2_ImplClasses;

public class _2_4_InstanceMethod_Invocatons {
    public static void main(String[] args) {
        var fred = new Employee("Fred", 8000);
        System.out.println("Salary before: " + fred.getSalary());
        fred.raiseSalary(5);
        System.out.println("Salary after: " + fred.getSalary());

        //cal setSalary()
        fred.setSalary(10000);
        System.out.println("setSalary(): " + fred.getSalary());
        //cal setSalary1()
        fred.setSalary1(20000);
        System.out.println("setSalary1(): " + fred.getSalary());
    }
}
