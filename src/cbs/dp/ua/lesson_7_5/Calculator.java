package cbs.dp.ua.lesson_7_5;

import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            try {

                System.out.println("Введите первый операнд: ");
                int x = scn.nextInt();

                System.out.println("Введите второй операнд: ");
                int y = scn.nextInt();

                System.out.println("Введите знак действия: ");
                String mark = scn.next();

                if (y == 0 && mark.equals("/")) {
                    throw new Exception("Division by 0 is not possible.");
                }

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
            } catch (Exception e) {
                System.err.println(e.getMessage());
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



