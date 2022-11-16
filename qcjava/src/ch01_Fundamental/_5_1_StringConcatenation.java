package ch01_Fundamental;

import java.time.ZoneId;

/**
 * @basic
 * @careful
 * @join
 */

public class _5_1_StringConcatenation {
    public static void main(String[] args) {
        //String can contain any Unicode
        System.out.println("Java\u2122"); //TM is "U+2122 Trade Mark Sign"

        //be careful
        int age = 37;
        System.out.println("Next year: " + age + 1);//371
        System.out.println("Next year: " + (age+ 1)); //38

        //String join
        String names = String.join(", ", "Hieu", "Quang", "Thuy", "Minh");
        System.out.println(names);
        String[] arr_names = {"Hieu", "Quang", "Thuy", "Minh"};
        System.out.println(String.join(", ", arr_names));

        //String builder
        System.out.println(ZoneId.getAvailableZoneIds());//long array string
        var builder = new StringBuilder();
        for (String id : ZoneId.getAvailableZoneIds()) {
            builder.append(id); //next string
            builder.append(", "); //next string
        }
        System.out.println(builder);
        String result = builder.toString();
        System.out.println(result.substring(0, 200) + "...");
        System.out.println(result.length());
    }
}
