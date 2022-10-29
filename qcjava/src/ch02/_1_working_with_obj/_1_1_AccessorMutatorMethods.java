package ch02._1_working_with_obj;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @mutator: if it changes the obj on which it was invoked
 * @accessor: if it leaves the obj unchanged.
 * @plusDays-of-LocalDate_class: is an accessor
 * @add_method-of-ArrayList_class: a mutator. after calling add, the array list obj is changed
 */

public class _1_1_AccessorMutatorMethods {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now().withDayOfMonth(1);
        System.out.println(date);
        int month;
        if(args.length > 2) {
            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = LocalDate.of(year,month,1);
        } else {
            month = date.getMonthValue();
        }

        System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
        DayOfWeek weekday = date.getDayOfWeek();
//        System.out.println(weekday);
        int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
//        System.out.println(value);
        for (int i = 1; i < value; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1); //accessor method with leaving date unchanged and return a newly constructed LocalDate Obj
            if(date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if(date.getDayOfWeek().getValue() != 1)
            System.out.println();

        //REFERENCE DEMO
        var friends = new ArrayList<String>(); //friend is empty
        friends.add("Quang"); //friends has size 1 => add mutator method
        ArrayList<String> people = friends; //now ppl and friends refer to the same obj
        people.add("Thuy");
        System.out.println(friends);

    }
}
