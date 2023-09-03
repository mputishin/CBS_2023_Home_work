package cbs.dp.ua.Thread_Runnable_8_2;

public class Main extends Thread {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Main());
        Thread t2 = new Thread(new Main());
        Thread t3 = new Thread(new Main());

        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("The thread" + Thread.currentThread().getName() + " is finished");
    }
}

