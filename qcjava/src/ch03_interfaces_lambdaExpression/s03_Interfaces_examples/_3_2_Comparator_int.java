package ch03_interfaces_lambdaExpression.s03_Interfaces_examples;

import java.util.*;

/**
 * @usecase: sort strings by increasing length, not in dictionary order => can't modify String class and can't use compareTo
 * @Comparator: an instance of a class that implements the Comparator int with the following abstract method
 * @code: <code>int compare(T first, T second)</code>
 * @easier_way: using lambda expression
 */

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        //arrange by increasing length, if same then arrange by dictionary order
        return o1.length() - o2.length() == 0 ? o1.compareTo(o2) : o1.length() - o2.length();
    }
}

public class _3_2_Comparator_int {

    public static void main(String[] args) {
        //Check with arrays
        String[] friends = {"Quang", "Thuy", "Minh"};
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends));

        //check with ArrayList
        ArrayList<String> friends1 = new ArrayList<>(List.of("Quang","Thuy","Minh"));
        Collections.sort(friends1, new LengthComparator());
        System.out.println(friends1);
    }
}
