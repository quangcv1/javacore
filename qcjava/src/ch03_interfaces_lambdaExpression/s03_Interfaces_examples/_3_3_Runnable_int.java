package ch03_interfaces_lambdaExpression.s03_Interfaces_examples;

/**
 * @Runnable-int: every processor has multiple cores, u want to keep those cores busy. => Run certain tasks in a separate thread, or give them to a thread pool for execution.
 * @task: define the task, u implement the Runnable interface. The interface has just one method run()
 */

class HelloTask implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i<10; i++) {
            System.out.println(i);
        }
    }
}
public class _3_3_Runnable_int {
    public static void main(String[] args) {
        Runnable task = new HelloTask();
        var thread = new Thread(task);
        var thread1 = new Thread(task);
        thread.start();
        thread1.start();
        System.out.println("Thread started");
    }
}
