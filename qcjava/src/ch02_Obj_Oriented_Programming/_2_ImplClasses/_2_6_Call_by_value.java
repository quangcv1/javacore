package ch02_Obj_Oriented_Programming._2_ImplClasses;

public class _2_6_Call_by_value {
    public static void main(String[] args) {
        var boss = new EvilManager();

        var fred = new Employee("Fred", 50000);
        System.out.println("Salary before: " + fred.getSalary());
        boss.giveRandomRaise(fred);
        System.out.println("Salary after: " + fred.getSalary());

        double sales = 100_000;
        System.out.println("Sales before: " + sales);
        boss.increaseRandomly(sales);//doesn't change, won't update passed-in variable
        System.out.println("Sales after: " + sales);

        System.out.println("Employee before: " + fred.getName());
        boss.replaceWithZombie(fred); //doesn't change, impossible to write a method that changes an obj to sth different
        System.out.println("Employee after: " + fred.getName());


    }
}
