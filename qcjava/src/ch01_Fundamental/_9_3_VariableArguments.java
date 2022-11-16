package ch01_Fundamental;

public class _9_3_VariableArguments {
    public static double average(double... values) {
        double sum = 0;
        for (double v : values) sum += v;
        return values.length == 0 ? 0 : sum / values.length;
    }

    public static double max(double first, double... rest) {
        double result = first;
        for (double v : rest) result = Math.max(v, result);
        return result;
    }

    public static double maxArr(double... values) {
        double result = values[0];
        for (double v : values) result = Math.max(v,result);
        return result;
    }

    public static void main(String[] args) {
        int n = 42;
        System.out.printf("%d\n", n);
        System.out.printf("%d %s\n", n, "widgets");

        double[] scores = { 3, 4.5, 10, 0 };
        double avg = average(scores);
        System.out.println(avg);
        double largest = max(3, 4.5, 10, 0);
        System.out.println(largest);
        double largestArr = maxArr(scores);
        System.out.println(largestArr);
        // average() returns 0, but max() doesn't compile
    }
}
