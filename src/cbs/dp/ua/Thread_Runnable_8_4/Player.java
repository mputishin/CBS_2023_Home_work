package cbs.dp.ua.Thread_Runnable_8_4;

public class Player extends Thread{

    Caunter cnt;

    public Player(Caunter cnt) {
        this.cnt = cnt;
    }

    @Override
    public void run() {
        cnt.add();
    }
}

