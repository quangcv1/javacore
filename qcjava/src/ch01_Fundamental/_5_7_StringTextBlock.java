package ch01_Fundamental;

import java.util.Scanner;

/**
 * @textblocks: easy to provide string literals that span multiple lines
 * @startWith: """
 * @endWith: """
 */

public class _5_7_StringTextBlock {
    public static void main(String[] args) {
        //A text block with 2 line breaks
        String greeting = """
                Hello
                World
                """;
        System.out.println(greeting);

        //This text block with 1 line break
        String prompt = """
                Hello, my name is Quang.
                Pls enter your name: """;
        System.out.println(prompt);

        //this text block has no line breaks
        prompt = """
                Hello, my name is Quang. \
                Pls enter your name: """;
        System.out.println(prompt);

        // You don't need to escape " (unless you have """)
        String html = """
<div class="Warning">
   Beware of those who say "Hello" to the world
</div>
""";
        System.out.println(html);

        // Use \s to avoid stripping trailing spaces
        // This string ends in two spaces

        prompt = """
Hello, my name is Hal.
Please enter your name: \s""";
        System.out.print(prompt);
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        // Common leading whitespace is stripped
        html = """
	           <div class="Warning">
	              Beware of those who say "Hello" to the world
	           </div>
	           """;
        System.out.println(html);
    }
}
