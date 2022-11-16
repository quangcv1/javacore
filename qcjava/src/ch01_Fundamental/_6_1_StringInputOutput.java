package ch01_Fundamental;

import java.util.Scanner;

/**
 * @System.out.println: output is sent to the "standard output stream" and shows up in a terminal window
 * @System.in: obj only has methods to read individual bytes from "standard input stream"
 * @Scanner: is attached to System.in
 * @nextLine()&next(): read line, first word
 * @nextInt()-nextDouble(): read an int, double
 * @hasNextLine()-hasNext()-hasNextInt()-hasNextDouble(): check wether that there is another line, word, int, floating-point number available
 * @readThePassword
 */

public class _6_1_StringInputOutput {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        //nextLine method reads a line of input
        System.out.println("What is your name?");
        String name = in.nextLine();
        //next read a single word (delimited by whitespace)
        // firstName = in.next();
        //read an integer
        System.out.println("How old are you?");
        int age = in.nextInt();

        //CHECK NAME AND OLD PROGRAM
        in = new Scanner(System.in);
        System.out.println("What is your name?");
        name = "";
        while (name == "") {
            name = in.nextLine();
        }
        System.out.println("How old are you?");
        if (in.hasNextInt()) {
            age = in.nextInt();
            System.out.printf("Hello, %s. Next year, you'll be %d.\n", name, age + 1);
        } else {
            System.out.printf("Hello, %s. Are you too young to enter an integer?", name);
        }

        //READ THE PASSWORD
//        Console terminal = System.console();
//        String username = terminal.readLine("User name: ");
//        char[] passwd = terminal.readPassword("Password: ");
//        System.out.println("Password: " + passwd);
//        System.out.println("Password: " + Arrays.toString(passwd));


    }
}
