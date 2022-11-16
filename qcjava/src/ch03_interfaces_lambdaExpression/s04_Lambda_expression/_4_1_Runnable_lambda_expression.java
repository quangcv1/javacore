package ch03_interfaces_lambdaExpression.s04_Lambda_expression;

public class _4_1_Runnable_lambda_expression {


    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i<10; i++) {
                System.out.println(i);
            }
        };
        var thread = new Thread(task);
        thread.start();
    }

}
