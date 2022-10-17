package ch01;

/**
 * @package: group related classes together and avoid conflicts when multiple multiple classes have the same name.
 */

public class _1_1_HelloWorld {
    /**
     * @main: a method, a func declared inside a class, the first method is called when the program runs
     * @static: indicate that the method does not operate on any objs (When main gets called, there are only a handful of predefined objs, none of them are instances of the HelloWorld class)
     * @void: indicate that it does not return any value
     * @System.out: an obj representing the "standard output" of the java program.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
