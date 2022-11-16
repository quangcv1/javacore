package ch04_inheritance_reflection.s02_Inheritance_hierarchies;

/**
 * @description: abstract class Person and abstract method getId() and final method getName()
 */
public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    //final method => can't override this method
    public final String getName() {return name; }

    //abstract method and force subclasses to implement body
    public abstract int getId();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
