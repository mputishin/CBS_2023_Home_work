package cbs.dp.ua;


import java.util.Scanner;

public class Example_7_N3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите сумму денег: ");
        int x = scn.nextInt();
        System.out.println("Введите курс валюты: ");
        double y = scn.nextDouble();

        Conversion convers = new Conversion(x,y);
        System.out.printf("Полученная сумма денег после обмена составляет: " + "%.2f", convers.convert(x,y));
    }
}

class Conversion {
    private int money;
    private double courseExchange;

    Conversion (int money, double courseExchange) {
        this.money = money;
        this.courseExchange = courseExchange;
    }

    double convert (int x, double y) {
        return x / y;
    }
}
