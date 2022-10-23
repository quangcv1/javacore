package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @add-remove
 * @convert-from-to-array
 * @revert-shuffle-sort-with-Collection
 */
public class _8_2_ArrayEnhanced {
    public static void main(String[] args) {
        var friends = new ArrayList<String>();
        friends.add("Peter");
        friends.add("Paul");
        friends.remove(1);
        friends.add(0, "Paul"); // Adds before index 0
        System.out.println("friends=" + friends);
        String first = friends.get(0);
        System.out.println("first=" + first);
        friends.set(1, "Mary");
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }

        //refer to the same obj
        ArrayList<String> people = friends; //reference to the same obj
        people.set(0, "Mary"); // now friends.get(0) is also "Mary"
        System.out.println("friends=" + friends);

        //COPY OBJ
        var copiedFriends = new ArrayList<>(friends);
        copiedFriends.set(0, "Fred"); // doesn't change friends
        System.out.println("copiedFriends=" + copiedFriends);
        System.out.println("friends=" + friends);

        //convert to Array
        System.out.println("CONVERT TO ARRAY");
        friends = new ArrayList<>(List.of("Peter", "Paul", "Mary"));
        String[] names = friends.toArray(new String[0]);
        System.out.println("names=" + Arrays.toString(names));
        System.out.println("names obj = : "+ names);

        //convert from Array to ArrayList
        System.out.println("CONVERT FROM ARRAY TO ARRAYLIST");
        var moreFriends = new ArrayList<>(List.of(names));
        System.out.println("names: " + names);
        System.out.println("moreFriends=" + moreFriends);

        //REVERT ARRAYLIST WITH COLLECTION from javautil
        System.out.println("REVERT ARRAY LIST");
        System.out.println("friends: " + friends);
        Collections.reverse(friends);
        System.out.println("After reversing, friends=" + friends);
        Collections.shuffle(friends);
        System.out.println("After shuffling, friends=" + friends);
        Collections.sort(friends);
        System.out.println("After sorting, friends=" + friends);
    }
}
