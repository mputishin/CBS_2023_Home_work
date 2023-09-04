package cbs.dp.ua.Thread_Runnable_8_5;

public class Thread1 extends Thread {

    Thread t1;

    public Thread1 () {
        System.out.println("The constructor works to create first thread");
    }

    public void setThread2 (Thread t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        System.out.println("Start first thread after command run");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("First thread is interrupted. Second thread is going to finish ... ");

      /*  try {                                               //Без використання в цьому коді join() - ,блокування не выдбудеться!
            t1.join();                                        //Вбираємо коментування цього блоку коду для формування deadlock.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        System.out.println("First thread is finished");
    }
}
