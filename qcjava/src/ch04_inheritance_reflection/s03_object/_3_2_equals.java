package ch04_inheritance_reflection.s03_object;

import java.util.Objects;

/**
 * @equal: tests whether one obj is considered equal to another. == whether two obj references are identical. Returns true if this obj should be considered equal to other, false if other is null or different from other.
 * @default: by default, 2 objs are equal if they are identical
 * @avoid_null-safe_alternative: instead of obj.equals(other), consider the null-safe alternative {@link Objects.equals(obj,other)}
 * @equal_in_subclass: first call equals on the superclass (Item). If that test doesn't pass, the objects can't be equal. If the "instance variables" of the superclass are equal then u are ready to compare the instance variable of the subclass. {@link _3_2_equals.DiscountedItem#equals(Object) equals_subclass} compare with {@link _3_2_equals.Item#equals(Object) equals_superclass}
 * @equal_with_compare_x.equals(y)_or_instanceof:
 * <pre>{@code
 * if(!(otherObject instanceof Item)) return false;
 * }</pre>
 *<p>this leaves open possibility that otherObject can belong to a subclass. Ex: u can compare an Item with a DiscountedItem. But equals method that it is symmetric: "For non-null x and y, the calls x.equals(y) and y.equals(x) need to return the same value.<p>
 *<p>Now suppose, x is an Item and y a DiscountedItem. Since x.equals(y) doesn't consider discounts, neither y.equals(x)</p>
 * @note_equal_instanceof: if the notion of equality is fixed in the supperclass and never varies in a subclass. Ex: this is the case if we compare employees by ID. In that case, make an instanceof test and declare the equals method as final.
 * <pre>{@code
 * public class Employee {
 *     private int id;
 *     ...
 *     public final boolean equals(Object otherObject) {
 *         if (this == otherObject) return true;
 *         if (otherObject instanceof Employee other) return id == other.id;
 *         return false;
 *     }
 *
 *     public int hashCode() { ... }
 * }
 * }</pre>
 */
public class _3_2_equals {
    private static class Item {
        private String description;
        private double price;

        public Item(String description, double price) {
            this.description = description;
            this.price = price;
        }

        @Override
        public boolean equals(Object otherObject) {
            //A quick test to see if the objects are identical
            if (this==otherObject) return true;

            //must return false if the argument is null
            if (otherObject == null) return false;

            //check that otherObject is an Item
            if (getClass() != otherObject.getClass()) return false;

            //test whether the instance variables have identical values
            //Why cast to item ? because this equals overrides Object.equals with para is of type Object, so we need to cast it to the actual type so u can look at its instance variable (description and price) to compare
            var other = (Item) otherObject;
            //price == other.price vs Double.equals if concerned abt +- vo cuc or NaN
            return Objects.equals(description, other.description) && price == other.price;

        }
    }
    private static class DiscountedItem extends Item {

        private double discount;

        public DiscountedItem(String description, double price, double discount) {
            super(description, price);
            this.discount = discount;
        }

        @Override
        public boolean equals(Object otherObject) {
            //the getClass test in the superclass fails if otherObj is not a DiscountedItem
            if (!super.equals(otherObject)) return false;
            var other = (DiscountedItem) otherObject;
            return discount == other.discount;
        }
    }
    public static void main(String[] args) {
        var item1 = new Item("ao", 10000);
        var item2 = new Item("ao", 10000);
        //if default then false because 2 items not reference the same
        //but we adjusted the equal method, so it's true because, now it compares description and price of 2 items
        System.out.println(item1.equals(null));
        System.out.println(Objects.equals(item1,item2));
    }
}
