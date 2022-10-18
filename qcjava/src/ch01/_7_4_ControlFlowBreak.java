package ch01;

import java.util.Scanner;

public class _7_4_ControlFlowBreak {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        boolean done = false;
        System.out.println("pls enter exit char");
        while (true) {
            String input = in.next();
            if("Q".equalsIgnoreCase(input)) break;
            System.out.println("not yet q");
        }
    }
}
