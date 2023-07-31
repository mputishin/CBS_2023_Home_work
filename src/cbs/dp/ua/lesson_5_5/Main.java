package cbs.dp.ua.lesson_5_5;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Friends friends = new Friends();

        friends.list.add("Alex");
        friends.list.add("Max");
        friends.list.add("John");
        friends.list.add("Bill");
        friends.list.add("James");
        friends.list.add("Michael");

        System.out.println(friends.list.toString());

        Collections.sort(friends.list);

        System.out.println(friends.list.toString());
    }
}
