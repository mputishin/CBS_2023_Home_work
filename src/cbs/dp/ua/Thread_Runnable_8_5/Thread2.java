package cbs.dp.ua.Thread_Runnable_8_5;

public class Thread2 extends Thread{

    Thread t2;

    public Thread2 () {
        System.out.println("The constructor works to create second thread");
    }

    public void setThread1 (Thread t2) {
        this.t2 = t2;
    }

    @Override
    public void run() {
        System.out.println("Start second thread after command run");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Second thread is interrupted. First thread is going to finish ... ");

        /*try {                                               //Без використання в цьому коді join() - ,блокування не выдбудеться!
            t2.join();                                        //Вбираємо коментування цього блоку коду для формування deadlock.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        System.out.println("Second thread is finished");
    }
}
