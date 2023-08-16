package cbs.dp.ua.Collection_Framework_2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i<5; i++) {
            System.out.println("Enter word: ");
            list.add(reader.readLine());
        }

        ArrayList<String> inTotal = doubleValues(list);
        for (int i=0; i<inTotal.size(); i++) {
            System.out.println(inTotal.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i=0; i< list.size(); i+=2) {
            list.add(i, list.get(i));
        } return list;
    }
}
