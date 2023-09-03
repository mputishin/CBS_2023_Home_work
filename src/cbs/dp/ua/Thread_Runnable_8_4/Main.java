package cbs.dp.ua.Thread_Runnable_8_4;

public class Main{

    public static void main(String[] args) {     //Сенс, додати одиницю к лічильнику різними потоками синхронно.

        Caunter cnt = new Caunter();

        Thread p1 = new Thread(new Player(cnt));
        Thread p2 = new Thread(new Player(cnt));
        Thread p3 = new Thread(new Player(cnt));

        p1.start();
        p2.start();
        p3.start();
    }
}
