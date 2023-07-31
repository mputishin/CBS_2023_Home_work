package cbs.dp.ua.lesson_5_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Любовь Кузминична");
        list.add("Наталья Ивановна");
        list.add("Лариса Ивановна");
        list.add("Елена Николаевна");
        list.add("Юлия Михайловна");

        System.out.println("Индекс любимого учителя: " + list.indexOf("Лариса Ивановна"));
        System.out.println("Индекс учителя, который не очень: " + list.indexOf("Наталья Ивановна"));
        System.out.println(list.toString());
    }
}
