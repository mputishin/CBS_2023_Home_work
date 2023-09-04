package cbs.dp.ua.Thread_Runnable_8_7;

public class Main {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("First thread");
        t2.setName("Second thread");
        t3.setName("Third thread");

        t2.setDaemon(true);
        t3.setDaemon(true);

        t1.start();                          // Потоки демони не рахують далі, по завершенні користувацького потоку!
        t2.start();
        t3.start();
    }

}

class MyThread extends Thread {

    @Override
    public void run() {
        if (isDaemon()) {
            System.out.println("Start daemon thread " + Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("The thread " + Thread.currentThread().getName() + " is finished");
        } else {
            System.out.println("Start typical thread " + Thread.currentThread().getName());
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("The thread " + Thread.currentThread().getName() + " is finished");
        }
    }
}
