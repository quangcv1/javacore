package ch01_Fundamental;

import java.util.Random;

public class _1_3_MethodCalls {
    /**
     * @System.out: an obj, an instance of a class called "PrintStream"
     * @PrintStream: has methods "println, print", and so on
     * @println,print: are instance methods (operate on objs, or instances, of the class)
     * @codestructure: object.methodName(arguments)
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        /**
         * @"Hello,World!": String, instance of the "String" class
         * @String: is a class which has a method "length"
         * @length: method that returns the length of a string obj
         */
        System.out.println("Hello, World!".length());

        /**
         * @construct-a-obj:
         * @codestructure: new Class(args)
         * @store-constructed-obj: with variable
         * @call-method-on-constructed-obj:
         */
        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());
        System.out.println(generator.nextBoolean());
    }
}
