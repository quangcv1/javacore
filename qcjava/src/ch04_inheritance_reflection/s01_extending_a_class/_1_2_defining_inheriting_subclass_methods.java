package ch04_inheritance_reflection.s01_extending_a_class;

/**
 * @see ch04_inheritance_reflection.s01_extending_a_class.Manager
 * @description: our Manager class has a new instance variable to store the bonus and a new method to set it
 * <pre>{@code
 * public class Manager extends Employee {
 *     private double bonus;
 *     ...
 *     public void setBonus(double bonus) {
 *         this.bonus = bonus;
 *     }
 * }
 * }</pre>
 * then check it
 * <pre>{@code
 * Manager boss = new Manager(...);
 * boss.setBonus(10000); // Defined in subclass
 * boss.raiseSalary(5); // Inherited from superclass
 * }</pre>
 */

public class _1_2_defining_inheriting_subclass_methods {
    public static void main(String[] args) {
        Manager boss = new Manager("quang",2000);
        boss.setBonus(10000);
        boss.raiseSalary(5);
        System.out.println(boss.getSalary()); // = raised salary + bonus = 2000 + 100 + 10000
    }
}
