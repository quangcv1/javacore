package ch03_interfaces_lambdaExpression.s09_Local_Anonymous_Classes;

import java.util.random.RandomGenerator;

/**
 * @see ch03_interfaces_lambdaExpression.s09_Local_Anonymous_Classes._9_1_Local_Classes
 * @note: in 9.1, RandomSequence was used exactly once: to construct the return value. In this case,, u can make the class "anonymous"
 */
public class _9_2_Anonymous_Classes {
    private static RandomGenerator generator = RandomGenerator.getDefault();
    public static IntSequence randomInts(int low, int high) {
        return new IntSequence() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                return low + generator.nextInt(high - low + 1);
            }
        };
    }

    public static void main(String[] args) {
        IntSequence dieTosses = randomInts(1,6);
        for (int i = 0; i < 10; i++) {
            System.out.println(dieTosses.next());
        }
    }
}
