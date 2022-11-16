package ch04_inheritance_reflection.s02_Inheritance_hierarchies;

/**
 * @suppose: a class extends a class and implements an interface with the same methods => "class win" rule
 * @conflict_method_on_interface_class: Named interface vs Person abstract class
 * @see ch04_inheritance_reflection.s02_Inheritance_hierarchies.Person
 * @see ch04_inheritance_reflection.s02_Inheritance_hierarchies.Named
 */
public class _2_5_Inheritance_and_default_methods {
    public static void main(String[] args) {
        Person p = new StudentExtendImp("Fred", 1729); // OK, a concrete subclass
        System.out.println(p.getName());
        StudentExtendImp s = (StudentExtendImp) p;
        System.out.println(s.getName());
        Named n = s;
        System.out.println(n.getName());
        Named n1 = new Named() {
            @Override
            public String getName() {
                return Named.super.getName();
            }
        };
        System.out.println(n1.getName());
    }
}
