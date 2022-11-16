package ch01_Fundamental;

import java.util.Random;

public class _7_3_ControlFlowLoopDoWhile {
    public static void main(String[] args) {
        var generator = new Random();
        int target = 5;
        int count = 1;
        int next;
        do {
            next = generator.nextInt(10);
            count++;
        } while (next != target);
        System.out.println("After " + count + " iterations, there was a values of " + target);
    }
}
