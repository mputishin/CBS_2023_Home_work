package cbs.dp.ua.Thread_Runnable_8_3;

public class ThirdThread extends Thread{

    @Override
    public void run() {
        for (int k = 0; k < 50; k++) {
            try {
                Thread.sleep(100);
                System.out.println("t3 = " + k);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
