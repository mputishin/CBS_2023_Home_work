package cbs.dp.ua;

import java.util.Scanner;

public class Lessons_OOP_N1_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите длинну и ширину прямоугольника");
        double length = scn.nextDouble();
        double width = scn.nextDouble();
        Rectangle rect = new Rectangle(length, width);
        rect.areaCalculator(rect.length, rect.width);
        rect.perimetrCalculator(rect.length, rect.width);
    }
}

class Rectangle {
    double length;
    double width;

    Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    void areaCalculator (double a, double b) {
        System.out.println("Площадь прямоугольника = " + (a * b));
    }

    void perimetrCalculator (double a, double b) {
        System.out.println("Периметр прямоугольника = " + (2*(a + b)));
    }
}