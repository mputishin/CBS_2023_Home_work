package cbs.dp.ua;

import java.util.Scanner;

public class Example_7_N2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите первый операнд: ");
        int x = scn.nextInt();

        System.out.println("Введите второй операнд: ");
        int y = scn.nextInt();

        System.out.println("Введите знак действия: ");
        String mark = scn.next();

        switch (mark) {
            case "+":
                System.out.println(Arithmetics.add(x,y));
                break;
            case "-":
                System.out.println(Arithmetics.sub(x,y));
                break;
            case "*":
                System.out.println(Arithmetics.mul(x,y));
                break;
            case "/":
                System.out.println(Arithmetics.div(x,y));
                break;
            default:
                System.out.println("Вы ввели неверный знак, попробуйте ещё раз: ");
        }
    }
}

class Arithmetics {

    static int add(int x, int y) {
        return x + y;
    }

    static int sub(int x, int y) {
        return x - y;
    }

    static int mul(int x, int y) {
        return x * y;
    }

    static double div (int x, int y) {
        return (double) x / y;
    }
}


