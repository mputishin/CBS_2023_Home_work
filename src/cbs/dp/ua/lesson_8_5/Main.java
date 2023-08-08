package cbs.dp.ua.lesson_8_5;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("Vasyka", 45, false);

        System.out.println(cat.toString());

        System.out.println(cat.hashCode());
    }
}
