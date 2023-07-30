package cbs.dp.ua.lesson_4_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter the document version: ");
        String version = scn.nextLine();
        CheckVersionDocument obj = new CheckVersionDocument();
        AbstractHandler abs = obj.checkDoc(version);

        abs.open();
        abs.create();
        abs.change();
        abs.save();
    }
}
