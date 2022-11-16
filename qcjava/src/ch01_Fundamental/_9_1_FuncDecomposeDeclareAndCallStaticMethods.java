package ch01_Fundamental;

import java.util.Scanner;

/**
 * @functional-decomposition: if your main method gets too long, decompose your program into multiple classes.
 */
public class _9_1_FuncDecomposeDeclareAndCallStaticMethods {
    public static double average(double x, double y) {
        double sum = x + y;
        return sum/2;
    }
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        var in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double result = average(a, b);
        System.out.println("Average: " + result);
    }
}
