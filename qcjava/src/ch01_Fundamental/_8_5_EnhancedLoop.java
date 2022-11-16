package ch01_Fundamental;

import java.util.ArrayList;
import java.util.List;

/**
 * @for-loop-enhanced: with array and ArrayList
 */

public class _8_5_EnhancedLoop {
    public static void main(String[] args) {
        //WITH ARRAY
        int[] numbers = {1,2,3,4};
        int sum = 0;
        //basic loop
        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum basic: " + sum);

        //enhanced loop
        for (int n : numbers) {
            sum += n;
        }
        System.out.printf("sum enhanced: %d\n", sum);

        //WITH ARRAY LIST
        var friends = new ArrayList<String>(List.of("Quang","Thuy","Minh"));
        for (String name : friends) {
            System.out.println(name);
        }
    }
}
