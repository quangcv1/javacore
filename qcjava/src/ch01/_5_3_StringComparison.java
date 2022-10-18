package ch01;

public class _5_3_StringComparison {
    public static void main(String[] args) {
        //if location is defined
        String location = "World";
        //should be
        System.out.println("location no computed with equal: " + (location.equals("World")));
        //never use == operator when only same obj in memory
        System.out.println("location no computed with ==: " + (location == "World"));


        //if location is computed
        location = "Hello World!";
        location = location.substring(6,11).trim();
        System.out.println("computed location value: " + location);
        System.out.println("computed location with equal: " + (location.equals("World")));
        //never use == operator when only same obj in memory
        System.out.println("computed location with == : " + (location == "World"));

        //null: does not refer to any obj at all, not even an empty string
        //null is not same with empty string "".
        //An empty string is a string of length zero
        //null isn't any string at all
        String middleName = null;
        //test whether an obj is null ? use ==
        System.out.println("null compare: " + (middleName == null));

        //test with literal string
        System.out.println("literal string with equal: " + "World".equals(location));

        //IGNORE LETTER CASE
        System.out.println("compare WOLRD with World: " + "WORLD".equalsIgnoreCase(location));

        //COMPARE STRINGS IN ORDER
        System.out.println("word before world: " + "word".compareTo("world"));
        System.out.println("a before b: " + "a".compareTo("b"));
        System.out.println("d after c: " + "d".compareTo("c"));

    }
}
