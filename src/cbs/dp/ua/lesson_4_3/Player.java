package cbs.dp.ua.lesson_4_3;

public class Player implements Playable, Recordable{

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void stopPlay() {
        System.out.println("Stop play");
    }

    @Override
    public void pausePlay() {
        System.out.println("Pause play");
    }

    @Override
    public void record() {
        System.out.println("Record");
    }

    @Override
    public void stopRecord() {
        System.out.println("Stop record");
    }

    @Override
    public void pauseRecord() {
        System.out.println("Pause record");
    }

}
