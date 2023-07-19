package cbs.dp.ua;

import java.util.Scanner;

public class Example_7_N7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите 3 числа подряд: ");
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        System.out.printf("Среднеарифметическое ваших 3 чисел = " + "%.2f", Calculator.calculate(x,y,z));
    }
}

class Calculator {
    static double calculate (int x, int y, int z) {
        return (double) (x+y+z)/3;
    }
}
