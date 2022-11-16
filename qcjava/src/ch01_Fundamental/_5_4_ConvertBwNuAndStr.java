package ch01_Fundamental;

public class _5_4_ConvertBwNuAndStr {
    public static void main(String[] args) {
        //Convert Int to String
        int n = 42;
        String str = Integer.toString(n); //sets str to "42"
        String str2 = Integer.toString(n,2); //sets str to "101010"
        System.out.println("convert to string: " + str + " " + str2);

        //Convert String containing an int to the number
        String str3 = "101010";
        n = Integer.parseInt(str3); //sets n to 101010
        int n2 = Integer.parseInt(str3, 2); //sets n2 to 42
        System.out.println("convert string to number: " + n + " " + n2);

        //convert str to float
        String str4 = "3.14";
        double x = Double.parseDouble(str4);
        System.out.println("Conver string to float: " + x);
    }
}
