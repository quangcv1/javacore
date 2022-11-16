package ch04_inheritance_reflection.s02_Inheritance_hierarchies;

/**
 * @description: subclass of Person with implement abstract method getId from superclass and implement constructor with one more para is id
 */

public class Student extends Person{
    private int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.getName() + "\', " +
                "id=" + id +
                '}';
    }
}
