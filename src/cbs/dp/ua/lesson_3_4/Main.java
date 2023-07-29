package cbs.dp.ua.lesson_3_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the version key: ");
        String key = scn.nextLine();
        KeyChecked check = new KeyChecked();
        check.checked(key);
    }
}
