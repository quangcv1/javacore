package ch01;

public class _7_1_ControlFlowBranches {
    public static void main(String[] args) {
        int count = 0;
        double sum = 1000.0;
        if (count > 0) {
            double avg = sum/count;
            System.out.println(avg);
        } else if (count == 0) {
            System.out.println(0);
        } else {
            System.out.println("Huh?");
        }
    }
}
