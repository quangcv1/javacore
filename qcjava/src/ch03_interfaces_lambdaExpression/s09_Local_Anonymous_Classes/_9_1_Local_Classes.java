package ch03_interfaces_lambdaExpression.s09_Local_Anonymous_Classes;

import java.util.random.RandomGenerator;

/**
 * @local_class: a class inside a method
 * @note: this occurs often when a class implements an interface and the caller of the method only cares about the interface, not the class
 * @advantages:
 * <li>Its name is hidden in the scope of the method</li>
 * <li>Second, the methods of the class can access variables from the enclosing scope, just like the variables of a lambda expression (int low and int high in this case), next() method captures 3 variables: low, high and generator</li>
 * @note: if u turned RandomInt into a nested class, u would have to provide an explicit constructor that receives these values and stores them in instance variables.
 */
public class _9_1_Local_Classes {
    private static RandomGenerator generator = RandomGenerator.getDefault();

    public static IntSequence randomInts(int low, int high) {
        //Local class RandomSequence is in method randomInts()
        class RandomSequence implements IntSequence {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                return low + generator.nextInt(high - low + 1);
            }
        }
        return new RandomSequence();// return possible because RandomSequence class implements IntSequence Int.
    }

    public static void main(String[] args) {
        IntSequence dieTosses = randomInts(1, 6);
        for (int i = 0; i < 10; i++) {
            System.out.println(dieTosses.next());
        }
    }

}
