package cbs.dp.ua.Thread_Runnable_8_3;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new FirstThread());
        Thread t2 = new Thread(new SecondThread());
        Thread t3 = new Thread(new ThirdThread());

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Level priority t1: " + t1.getPriority());
        System.out.println("Level priority t2: " + t2.getPriority());
        System.out.println("Level priority t3: " + t3.getPriority());

        t1.start();
        t2.start();
        t3.start();
    }
}
