package cbs.dp.ua.Thread_Runnable_8_3;

public class SecondThread extends Thread{

    @Override
    public void run() {
        for (int j = 0; j < 50; j++) {
            try {
                Thread.sleep(100);
                System.out.println("t2 = " + j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
