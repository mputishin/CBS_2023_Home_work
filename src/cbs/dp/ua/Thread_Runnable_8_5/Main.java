package cbs.dp.ua.Thread_Runnable_8_5;

public class Main {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.setThread2(t2);
        t2.setThread1(t1);

        t1.start();
        t2.start();
    }
}
