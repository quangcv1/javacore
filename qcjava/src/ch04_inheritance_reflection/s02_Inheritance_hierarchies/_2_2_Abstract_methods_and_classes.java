package ch04_inheritance_reflection.s02_Inheritance_hierarchies;

/**
 * @abstract_methods_classes: A class can define a method without an implementation, forcing subclasses to implement it. Such a method, and the class containing it, are called abstract
 * @abstract_class_note: an abstract class can have nonabstract methods, such as the getName() method
 * @abstract_class_vs_interface: it is not possible to construct an instance
 * @see ch04_inheritance_reflection.s02_Inheritance_hierarchies.Person Person-abstract class containing abstract method
 * @see ch04_inheritance_reflection.s02_Inheritance_hierarchies.Student Student-subclass of Person
 *
 */

public class _2_2_Abstract_methods_and_classes {
    public static void main(String[] args) {
        //anonymous extend class possible and different with construct an instance of an abstract class with error
        Person quang = new Person("Quang") {
            /**
             * @desciption: we have to override it since getId() is an abstract method
             * @return 0
             */
            @Override
            public int getId() {
                return 0;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + this.getName() + '\'' + ", " +
                        "id=" + this.getId() +
                        '}';
            }

            /** try to override getName is final method then error
            @Override
            public String getName() {
                return super.getName();
            }
             */
        };
        System.out.println(quang);

        //or construct from a subclass not anonymous subclass
        Person minh = new Student("Minh", 123);
        System.out.println(minh);

        /** 'Person' is abstract; cannot be instantiated
        Person p = new Person("Thuy"); //Error
         */

        //cast
        Student s = (Student) minh;
        System.out.println(s);
        //cast with instanceof
        if(minh instanceof Student s1) {
            System.out.println(s1);
        }
    }
}
