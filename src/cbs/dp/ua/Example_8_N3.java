package cbs.dp.ua;

import java.util.Scanner;

public class Example_8_N3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество клиентов для поставки товара: ");
        int points = scn.nextInt();
        System.out.println("Количество возможных путей доставок: " + countWays(points));
    }

    public static int countWays(int num) {
        while (num !=0) {
            return (num * countWays(num - 1));
        }
        return 1;
    }
}
