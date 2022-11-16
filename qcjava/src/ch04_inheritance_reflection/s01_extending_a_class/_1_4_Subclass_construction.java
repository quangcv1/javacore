package ch04_inheritance_reflection.s01_extending_a_class;

/**
 * @subclass_construction: let supply a constructor for this class extend from Employee. Since this constructor cannot access the private instance var of the Employee class, it must initialize them through a superclass constructor
 * @super: super indicates a call to the constructor of the Employee superclass with name and salary as arguments. The superclass constructor call must be the first statement in the constructor for the subclass
 * @note: if the subclass does not explicitly call any superclass constructor, the superclass must have a no-argument constructor which is implicitly called.
 */
public class _1_4_Subclass_construction extends Employee {

    private double bonus;

    //subclass construction from superclass Employee
    //super indicates a call to the constructor of the Employee superclass with name and salary as arguments
    public _1_4_Subclass_construction(String name, double salary) {
        super(name, salary);
        bonus = 0;
    }
}
