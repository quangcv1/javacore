package ch01_Fundamental;

import java.util.Random;

public class _3_1_VariableDeclaration {
    public static void main(String[] args) {
        //1. Variable Declarations
        int total = 0;
        System.out.println("total: " + total);
        int total1 = 0, count; //count is an uninitialized int

        //2. Obj declare
        //First Random is the type of the variable generator
        //Second Random is a part of the new expression for constructing an obj of that class
        Random generator = new Random();
        //avoid repetition with var keyword
        var generator1 = new Random();

        System.out.println(generator.nextInt());
        System.out.println(generator1.nextDouble());

    }
}
