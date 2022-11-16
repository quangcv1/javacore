package ch01_Fundamental;

import java.util.ArrayList;
import java.util.List;

/**
 * @generic-class-limitation: u can't use primitive types as type para ex: ArrayList<int> is illegal.
 * @corresponding-wrapper-class: Integer, Byte, Short, Long, Character, Float, Double and Boolean. Ex: ArrayList<Integer> instead of ArrayList<int>
 * @conversion between primitive and their corresponding wrapper types is automatic.
 * @autobosxing: in the call to add, an Integer obj holding value 42 was automatically constructed in a process
 * @note: == and != operators compare obj references, not the contents of objs.
 */
public class _8_4_WrapperClassForPrimitiveType {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        numbers.add(42); //autoboxing
        numbers.add(43);
        numbers.add(42);
        System.out.println(numbers);
        int first = numbers.get(0); //get returned an Integer obj. Before assigning to the int variable, the obj was unboxed to yield the int value inside.
        System.out.println(numbers.get(0) == numbers.get(2));

        var str = new ArrayList<>(List.of("Quang","Thuy","Quang"));
        System.out.println(str);
        System.out.println(str.get(0) == str.get(2));

    }
}
