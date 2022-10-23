package ch01;

public class _8_8_Array_psvm {
    /**
     * @cmd: java .\_8_8_Array_psvm.java -g cruel world
     * @output: args[0]="-g"; args[1]="cruel"; args[2]="world" => Goodbye/n cruel/n world/n
     * @cmd: java .\_8_8_Array_psvm.java -h
     * @output: Hello
     * @cmd: java .\_8_8_Array_psvm.java -g
     * @output: Goodbye
     *
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if(arg.equals("-h")) arg = "Hello";
            else if (arg.equals("-g")) arg = "Goodbye";
            System.out.println(arg);
        }
    }
}
