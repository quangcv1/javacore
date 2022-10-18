package ch01;

public class _5_5_SpringApi {
    public static void main(String[] args) {
        String str = "hello world!";
        System.out.println("startsWith he: " + str.startsWith("he"));
        System.out.println("startsWith hl: " + str.startsWith("hl"));
        System.out.println("endWith d!: " + str.endsWith("d!"));
        System.out.println("contains d: " + str.contains("d"));

        System.out.println("indexOf l: " + str.indexOf('l'));
        System.out.println("lastIndexOf hello " + str.lastIndexOf('l')); //9
        System.out.println("indexOf fromIndex: " + str.indexOf('l',5));//9

        System.out.println("replace l with n: " + str.replace('l','n')); //henno wornd
        System.out.println("upper and lower case: " + str.toUpperCase() + " " + str.toLowerCase());
        System.out.println("strip: " + "    Hello     ".strip() + "end");
        System.out.println("strip: " + "    Hello     ".trim() + "end");
    }
}
