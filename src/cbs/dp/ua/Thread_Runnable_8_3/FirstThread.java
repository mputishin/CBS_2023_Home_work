package cbs.dp.ua.Thread_Runnable_8_3;

public class FirstThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(100);
                System.out.println("t1 = " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
