package ch01_Fundamental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Arrays-java.util: class provide implementations of common algorithms for arrays and array lists.
 * @Collection-java.util: class provide implementations of common algorithms for arrays and array lists.
 */
public class _8_7_ArrayAlgorithms {
    public static void main(String[] args) {
        int[] numbers = {2,3,4,5};
        ArrayList<String> friends = new ArrayList<>(List.of("Quang","Thuy","Minh"));
        //fill an array or an arraylist
        Arrays.fill(numbers,0);
        System.out.println(Arrays.toString(numbers));
        Collections.fill(friends,"");
        System.out.println(friends);

        int[] numbers1 = {2,4,3,7,5};
        ArrayList<String> friends1 = new ArrayList<>(List.of("Quang","Thuy","Minh"));
        //sort
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));
        Collections.sort(friends1);
        System.out.println(friends1);
        //for arrays (not arraylist), use paralleSort() that distributes the work over multiple processors if the array is large
        int[] number2 = {3,6,1,2,4,10,9,87,33};
        Arrays.parallelSort(number2);
        System.out.println(Arrays.toString(number2));

        //FOR ARRAYLIST NO COUNTERPART FOR ARRAYS
        //Reverses the elements
        System.out.println("before reverse: " + friends1);
        Collections.reverse(friends1);
        System.out.println("after reverse: " + friends1);

        //shuffle
        Collections.shuffle(friends1);
        System.out.println("shuffle: " + friends1);
    }
}
