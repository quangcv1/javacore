package ch01;

import java.util.Scanner;

public class _7_4_ControlFlowContinue {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Pls enter positive number: ");
        while(in.hasNextInt()) {
            int input = in.nextInt();
            if (input < 0) continue;
            System.out.println("you win");
            break;
        }
    }
}
