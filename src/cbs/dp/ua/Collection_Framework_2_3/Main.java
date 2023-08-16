package cbs.dp.ua.Collection_Framework_2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Integer> integerList = getIntegerList();
        System.out.println("The minimum number is: " + getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        Integer min = Collections.min(array);
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        LinkedList<Integer> list = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        int n = Integer.parseInt(reader.readLine());
        for (int i=0; i<n; i++) {
            System.out.println("Enter numbers: ");
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}
