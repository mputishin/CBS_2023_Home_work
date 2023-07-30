package cbs.dp.ua.lesson_4_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Player player = new Player();
        System.out.println("Press button: ");
        String button = scn.nextLine();

        switch (button) {
            case "play":
                player.play();
                break;
            case "record":
                player.record();
                break;
            case "pauseplay":
                player.pausePlay();
                break;
            case "pauserecord":
                player.pauseRecord();
                break;
            case "stoprecord":
                player.stopRecord();
                break;
            case "stopplay":
                player.stopPlay();
                break;
        }
    }
}
