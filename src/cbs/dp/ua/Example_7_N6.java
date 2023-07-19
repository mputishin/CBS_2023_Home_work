package cbs.dp.ua;

import java.util.Scanner;

public class Example_7_N6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i<5; i++) {
            System.out.println("Введите число: ");
            int a = scn.nextInt();
            PowerA234.powerA234(a);
        }
    }
}
class PowerA234 {

    static void powerA234 (int a) {
        double b = Math.pow(a,2);
        System.out.println("Число " + a + " возведённое в " + 2 + " степень = " + b);
        b = Math.pow(a,3);
        System.out.println("Число " + a + " возведённое в " + 3 + " степень = " + b);
        b = Math.pow(a,4);
        System.out.println("Число " + a + " возведённое в " + 4 + " степень = " + b);
    }
}
