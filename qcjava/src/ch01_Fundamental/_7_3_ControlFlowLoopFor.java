package ch01_Fundamental;

import java.util.Random;

public class _7_3_ControlFlowLoopFor {
    public static void main(String[] args) {
        var generator = new Random();
        var count = 20;
        int sum = 0;
        for (int i= 1; i<=count; i++) {
            int next = generator.nextInt(10);
            sum = sum + next;
        }
        System.out.println("After " + count + " iterations, the sum is " + sum);
    }
}
