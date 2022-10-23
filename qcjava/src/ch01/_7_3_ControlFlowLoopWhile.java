package ch01;

import java.util.Random;

public class _7_3_ControlFlowLoopWhile {
    public static void main(String[] args) {
        var generator = new Random();
        int sum = 0;
        int count = 0;
        int target = 90;
        while (sum < target) {
            int next = generator.nextInt(10);
            sum = sum + next;
            count++;
        }
        System.out.println("After " + count + " iterations, the sum is " + sum);
    }
}
