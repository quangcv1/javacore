package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Array-copy: refer to same or not same array
 * @Arrays.copyOf
 * @note: There is no easy way to convert between primitive type arrays and the corresponding array lists of wrapper classes. For example, to convert between an int[] and an ArrayList<Integer>, you need an explicit loop or an IntStream (see Chapter 8).
 */

public class _8_6_CopyArrayArrayLists {
    public static void main(String[] args) {
        //ARRAY
        int[] primes = {2,3,5,7,11,42};
        //copy but both variables refer to the same array
        int[] numbers = primes;
        numbers[0] = 1;
        System.out.println("refer to same array: " + (primes==numbers));
        System.out.println("primes: " + Arrays.toString(primes));

        //copy but not refer to the same array
        //constructs a new array of desired length and copies the elements of the original array into it
        int[] copiedPrimes = Arrays.copyOf(primes,primes.length);
        System.out.println("refer to same array: " + (primes==copiedPrimes));

        //ARRAYLIST
        var friends = new ArrayList<String>(List.of("Quang", "Thuy", "Minh"));
        //refer same arraylist
        ArrayList<String> people = friends;
        System.out.println("ArrayList: " + people);
        System.out.println("refer to same arraylist: " + (people==friends));
        people.set(0,"Hieu");
        System.out.println("ArrayList after set: " + friends);
        //not refer to same arraylist
        var copiedFriends = new ArrayList<>(friends);
        System.out.println("refer to same arraylist: " + (friends==copiedFriends));

        //COPY AN ARRAY INTO AN ARRAYLIST
        String[] names = {"1","2","3"};
        var namesArrayList = new ArrayList<>(List.of(names));
        System.out.println("copy array to arraylist: " + namesArrayList);

        //COPY AN ARRAYLIST INTO AN ARRAY
        String[] friendsArray = friends.toArray(new String[0]);
        System.out.println("copy arrayList to array: " + Arrays.toString(friendsArray));

    }
}
