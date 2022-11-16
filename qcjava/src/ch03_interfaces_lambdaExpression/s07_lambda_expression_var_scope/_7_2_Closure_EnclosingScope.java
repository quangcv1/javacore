package ch03_interfaces_lambdaExpression.s07_lambda_expression_var_scope;

/**
 * @see <a href="https://learning.oreilly.com/library/view/core-java-for/9780138051846/ch03.xhtml#sec3_8">3.7.2</a>
 * @lambda_3_ingredients:
 * <li>A block of code</li>
 * <li>Parameters</li>
 * <li>Values for the free variables - that is, the variables that are not parameters and not defined inside the code</li>
 * @step: one translate a lambda expression into an obj with a single method, so that the values of the free variables are copied into instance variables of that obj. => CLOSURE
 * @restriction_in_captured_value: can only reference variables whose value doesn't change. This is sometimes described by saying that lambda expression capture values, not variables
 * @effectively_final_rule: a lambda expression cannot mutate any captured variable
 */
public class _7_2_Closure_EnclosingScope {
    //lambda expression - free variables
    //values of text and count have been captured by the lambda expression.
    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
            for (int i = 0; i < count; i++) {
                System.out.println(text);
            }
        };
        new Thread(r).start();
    }

    //effectively final rule
//    public static void repeatMessage_rule(String text, int count, int threads) {
//        Runnable r = () -> {
//            while (count > 0) {
//                count--; //Error: can't mutate captured variable
//                System.out.println(text);
//            }
//        };
//        for (int i=0; i<threads;i++) new Thread(r).start();
//    }

    public static void main(String[] args) {
        //Error - Variable used in lambda expression should be final or effectively final
        //because lambda expression tries to capture i, but i changes. There is no single value to capture.
//        for (int i = 0; i < 10; i++) {
//            new Thread(
//                    () -> System.out.println(i)
//            ).start();
//        }

        //enhanced for loop is effectively final since its scope is a single iteration
        //a new var arg is created in each iteration and assigned the next value from the args array. In contrast, the scope of the var "i" in the preceding example was the entire loop.
        for (String arg : args) {
            new Thread(
                    () -> System.out.println(arg)
            ).start();
        }
        for (String e : new String[] {"quang","Thuy","Minh"}) {
            new Thread(
                    () -> System.out.println(e)
            ).start();
        }
    }
}
