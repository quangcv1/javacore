package ch04_inheritance_reflection.s01_extending_a_class;

public class ConcurrentWorker extends Worker{
    @Override
    public void work() {
        //The thread is constructed with a Runnable whose run method calls the work method of the superclass
        var t = new Thread(super::work);
        t.start();
        var t1 = new Thread(() -> {super.work(); super.work();});
        t1.start();
    }
}
