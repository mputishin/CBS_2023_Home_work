package cbs.dp.ua.lesson_5_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

       Integer [] arr = new Integer[]{3, 4, 12, 25, 9, 31, 42, 16, 67, 23};
       ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr);

        System.out.println(list.toString());

        ListIterator <Integer> listitr = list.listIterator(list.size());

        while (listitr.hasPrevious()) {
            Integer tmp = listitr.previous();
            listitr.set(tmp+1);
        }

        System.out.println(list.toString());
    }
}
