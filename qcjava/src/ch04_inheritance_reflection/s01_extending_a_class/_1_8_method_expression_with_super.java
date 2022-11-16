package ch04_inheritance_reflection.s01_extending_a_class;

/**
 * @reference: chapter 3
 * @method_expression_with_super: a method expression can have the form object::instanceMethod. It is also valid to use super instead of an obj reference.
 * @syntax: super::instanceMethod. Use this as the target and invokes the superclass version of the given method.
 */
public class _1_8_method_expression_with_super extends Employee{


    public _1_8_method_expression_with_super(String name, double salary) {
        super(name, salary);
    }


    public static void main(String[] args) {
        //test with Worker and ConcurrentWorker with the super::instanceMethod is defined in ConcurrentWorker
        var worker = new ConcurrentWorker();
        worker.work();
        System.out.println("Done");
    }
}
