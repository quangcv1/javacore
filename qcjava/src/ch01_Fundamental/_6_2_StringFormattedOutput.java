package ch01_Fundamental;

public class _6_2_StringFormattedOutput {
    public static void main(String[] args) {
        System.out.println(1000.0/3.0);
        //print with a field width of 8 and 2 digits of precision
        System.out.printf("%8.2f",1000.0/3.0); //__333.33 (2 leading spaces and 6 characters)
        System.out.println();
        System.out.printf("%.2f",1000.0/3.0);

        //MULTIPLE ARGUMENTS
        System.out.printf("\nHello, %s. Next year, you'll be %d. \n", "Quang", 37);

        //GROUPING SEPARATORS
        System.out.printf("%,+.2f",100000.0 / 3.0); //+33,333.33

        String message = "\nHello, %s. Next year, you'll be %d.\n".formatted("Quang", 27);
        System.out.println(message);
    }
}
