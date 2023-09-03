package cbs.dp.ua.Thread_Runnable_8_4;

public class Caunter {

    int count;

    synchronized void add () {
        System.out.println(Thread.currentThread().getName() + " is started");
        for (int i = 0; i < 10; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + " " + count);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " is finished");
    }
}
