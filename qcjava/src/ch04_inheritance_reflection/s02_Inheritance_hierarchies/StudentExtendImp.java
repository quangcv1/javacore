package ch04_inheritance_reflection.s02_Inheritance_hierarchies;

public class StudentExtendImp extends Person implements Named {
    private int id;
    public StudentExtendImp(String name, int id) {
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
