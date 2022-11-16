package ch04_inheritance_reflection.s02_Inheritance_hierarchies;

public interface Named {
    default String getName() {
        return "default name";
    }
}
