package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ArrayList-class: in the java.util, manages an array internally that grow and shrink on demand, and is a part of a larger collections framework.
 * @behavior: when an array becomes too small or is insufficiently utilized, another internal array is automatically created, and the elements are moved into it. This process is invisible to the programmer using the array list.
 * @ArrayList-generic-class: a class with a type parameter
 * @ArrayList-vs-Array: Type[] vs ArrayList<Type>
 * @List.of-method: yields an unmodifiable list of the given elements which you then use to construct an ArrayList.
 * @ArrayList.size(): yields the current size of the list.
 */
public class _8_3_ArrayLists {
    public static void main(String[] args) {
        //Declare
        ArrayList<String> friends = new ArrayList<String>();
        var friends1 = new ArrayList<String>();
        ArrayList<String> friends2 = new ArrayList<>();

        //initializer syntax
        var friends3 = new ArrayList<>(List.of("Hien", "Heo"));
        System.out.println(friends3);

        //add element
        friends.add("Trang");
        friends.add("Toai");
        System.out.println(friends); //can print directly vs array
        String[] friendsarray = {"Tuyen", "Lua"};
        System.out.println("array print: " + friendsarray);
        System.out.println("array print with Arrays util: " + Arrays.toString(friendsarray));

        //remove and add
        friends.remove(1);
        friends.add(0,"Quang");//add before index 0
        System.out.println(friends);

        //get and set
        //set method replace an element with another
        String first = friends.get(0);
        friends.set(1,"Quang Teo");
        System.out.println(friends);

        //size()
        for (int i=0; i<friends.size(); i++) {
            System.out.println(friends.get(i));
        }
    }
}
