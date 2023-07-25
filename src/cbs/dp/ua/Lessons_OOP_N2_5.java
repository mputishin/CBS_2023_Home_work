package cbs.dp.ua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lessons_OOP_N2_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите радиус круга: ");
        double r = Double.parseDouble(reader.readLine());
        MyArea.areaOfCircle(r);
    }
}

class MyArea {
    static final double PI = 3.14;

    static void areaOfCircle (double radius) {
        System.out.println("Площадь круга равна = " + (PI*(radius*radius)));
    }
}