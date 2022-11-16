package ch04_inheritance_reflection.s03_object;

import java.util.HashMap;
import java.util.Objects;

/**
 * @des: yields a hash code for this obj. Equal objs must have the same hash code. Unless overridden, the hash code is assigned in some way by the virtual machine.
 * @String_hashCode: the String class uses the following algorithm to compute the hash code:
 * <pre>{@code
 * int hash = 0;
 * for (int i = 0; i < length(); i++)
 *     hash = 31 * hash + charAt(i);
 * }</pre>
 * if x.equals(y) then
 * <pre>{@code
 * x.hashCode() = y.hashCode()
 * }</pre>
 * @note: if x.equals(y), then it must be the case that x.hashCode() == y.hashCode(). As u can see, this is the case for the String class since strings with equal characters produce the same hash code.
 * @Object.equals: tests for identical objects, the only thing that matters is that identical objects have the same hashcode
 * @if_not_same_hashCode: if u redefine the equals method, u will also need to redefine the hashCode() to be compatible with "equals". If u don't, and users of your class insert objects into a hash set or hash map, they might get lost!
 * @Objects.hash_varargs: method computes the hash codes of its arguments and combines them. The method is null-safe. If your class has instance variables that are arrays, compute their hash codes first with the static "Arrays.hashCode()", which combines a hash code composed of the hash codes of the array elements. Pass the result to "Objects.hash()"
 * @note_with_interface: an interface can't define a default method for "toString, equals, or hashCode" as a consequence of the "classes win" rule, such a method could never win against "Object.toString, Object.equals, or Object.hashCode"
 */
public class _3_3_hasCode {
    private static class Item {
        private String description;
        private double price;

        public Item(String description, double price) {
            this.description = description;
            this.price = price;
        }

        @Override
        public boolean equals(Object objectOther) {
            if (this == objectOther) return true;
            if (objectOther == null || getClass() != objectOther.getClass()) return false;
            Item other = (Item) objectOther;
            return Double.compare(other.price, price) == 0 && Objects.equals(description, other.description);
        }

        //if comment this then hashcode of item1 and item2 will be different even they are equals
        @Override
        public int hashCode() {
            //simply combine the hash codes of the instance variables.
            return Objects.hash(description, price);
        }
    }
    public static void main(String[] args) {
        //hashcode of String class
        System.out.println("quang".hashCode());
        System.out.println("thuy".hashCode());
        System.out.println("quang".hashCode()=="quang".hashCode());

        //check hashcode of item obj
        Item item1 = new Item("ao", 10000);
        var item2 = new Item("ao", 10000);
        System.out.println("Object: " + item1.equals(item2));//equals true
        System.out.println("hashCode: item1: " + item1.hashCode() + " and item2: " + item2.hashCode()); //different hashCode if not override hashCode method

        var testHash1 = new HashMap<String,Item>();
        var testHash2 = new HashMap<String,Item>();
        testHash1.put("abc",item1);
        testHash2.put("abc",item2);
        System.out.println(testHash1.equals(testHash2));
        System.out.println(testHash1);
        System.out.println(testHash2);

    }
}
