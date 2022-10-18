package ch01;

/**
 * @constant-outside-a-method: using the static keyword
 * @constant-inside-a-method
 * @System-class: declares a constant "public static final PrintStream out"
 */
public class _3_4_Constants {
    //constant outside a method
    public static final int DAYS_PER_WEEK = 7;

    //enum
    enum Weekday {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {
        //constant inside a main method
        final int DAYS_PER_YEAR = 365;

        //defer the initialization of a final variable.
        final int DAYS_IN_FEBRUARY;
        boolean leapYear = true;
        if (leapYear) {
            DAYS_IN_FEBRUARY = 29;
        } else {
            DAYS_IN_FEBRUARY = 28;
        }
    }
}
