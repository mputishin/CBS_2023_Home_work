package cbs.dp.ua.Collection_Framework_2_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Enter the word: ");
            String tmp = reader.readLine();
            if (tmp.equals("end")) break;
            else list.add(tmp);
        }
        for (int i=0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
