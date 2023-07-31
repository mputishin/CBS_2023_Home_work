package cbs.dp.ua.lesson_5_2_3;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        zoo.list.add(0, "Lion");
        zoo.list.add(1, "Tiger");
        zoo.list.add(2, "Puma");
        zoo.list.add(3, "Hipo");
        zoo.list.add(4, "Elephant");
        zoo.list.add(5, "Jaguar");
        zoo.list.add(6, "Rabbit");
        zoo.list.add(7, "Wolf");

        System.out.println(zoo.list.toString());

        zoo.list.remove(1);
        zoo.list.remove(3);
        zoo.list.remove(5);

        System.out.println("Amount of elements: " + zoo.list.size());

        zoo.list.remove(0);
        zoo.list.remove(1);

        System.out.println("Amount of elements: " + zoo.list.size());

        zoo.list.remove(0);
        zoo.list.remove(1);

        System.out.println("Amount of elements: " + zoo.list.size());

    }

}
