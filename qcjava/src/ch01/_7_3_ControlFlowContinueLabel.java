
package ch01;

import java.util.Scanner;

public class _7_3_ControlFlowContinueLabel {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var name = "";
        var age = 0;
        System.out.println("Pls enter your age: ");
        exit:
        while (true) {
            name = "quang";
            age = in.nextInt();
            while (age != 37) {
                System.out.println(name + " not " + age);
                continue exit;
            }
            break ;
        }
    }
}
