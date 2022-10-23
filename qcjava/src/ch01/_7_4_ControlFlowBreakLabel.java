package ch01;

import java.util.Scanner;

public class _7_4_ControlFlowBreakLabel {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var name = "";
        var age = 0;
        System.out.println("pls enter age");
        outer:
        while (true) {
            name = "quang";
            while(true) {
                age = in.nextInt();
                if(age == 37) break outer;
                System.out.println(name + " not " + age);
            }
        }
    }
}
