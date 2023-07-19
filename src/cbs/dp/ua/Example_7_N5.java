package cbs.dp.ua;

import java.util.Scanner;

public class Example_7_N5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i<5; i++) {
            System.out.println("Введите число: ");
            int a = scn.nextInt();
            PowerA3.powerA3(a);
        }
    }
}
class PowerA3 {

    static void powerA3 (int a) {
        double b = Math.pow(a,3);
        System.out.println("Число " + a + " возведённое в " + 3 + " степень = " + b);
    }
}