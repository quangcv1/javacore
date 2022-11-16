package ch02_Obj_Oriented_Programming._1_working_with_obj;

import java.util.ArrayList;

public class _1_2_ObjReference {
    public static void main(String[] args) {
        //REFERENCE DEMO
        var friends = new ArrayList<String>(); //friend is empty
        friends.add("Quang"); //friends has size 1 => add mutator method
        ArrayList<String> people = friends; //now ppl and friends refer to the same obj
        people.add("Thuy");
        System.out.println(friends);
    }
}
