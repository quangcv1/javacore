package ch04_inheritance_reflection.s01_extending_a_class;

import java.util.ArrayList;

/**
 * @anonymous_subclasses: just as you can have an anonymous class that implements an interface u can have an anonymous class that extends a superclass. With extend u can add methods or override a method
 * @usecase: this can be handy for debugging
 */

public class _1_7_anonymous_subclasses {
    public static void invite(ArrayList<String> friends) {
        System.out.println("Guest list: " + friends);
    }
    public static void main(String[] args) {
        //Anonymous subclass from superclass String
        var names = new ArrayList<String>(100) {
            @Override
            public void add(int index, String element) {
                super.add(index, element);
                System.out.printf("Adding %s at %d\n", element, index);
            }
        };

        names.add(0,"Quang");
        names.add(1,"Thuy");
        names.add(0, "Hieu");//add to first and then "Quang" move to
        names.add(1,"Quang");// index 1 and "Thuy" move to index 2
        System.out.println(names);
        for(String str : names) {
            System.out.println(str);
            System.out.println(names.indexOf(str));//if index 1 - "Quang", index 2 - "Quang" then indexOf("Quang") always 1
        }
        invite(names);
        names.remove(0);
        System.out.println(names);
        names.remove(2);
        System.out.println(names);

        //double brace initialization
        invite(
                new ArrayList<String>() {
                    {
                        add("Harry");
                        add("Sally");
                    }
                }
        );
    }
}
