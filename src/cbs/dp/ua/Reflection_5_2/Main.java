package cbs.dp.ua.Reflection_5_2;


import java.util.Arrays;

public class Main {

    public static void determinantClass(Object obj) {
        Class<?> cl = obj.getClass();
        System.out.println("Имя класса: " + cl);
        System.out.println("Поля класса: " + Arrays.toString(cl.getDeclaredFields()));
        System.out.println("Родительский класс: " + cl.getSuperclass());
        System.out.println("Методы класса: " +  Arrays.toString(cl.getDeclaredMethods()));
        System.out.println("Конструкторы класса: " + Arrays.toString(cl.getConstructors()));
    }
    public static void main(String[] args) {

        determinantClass("word");
        determinantClass('e');
        determinantClass(5);
    }
}
