package cbs.dp.ua.Collection_Framework_2_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        while (true) {
            System.out.println("Enter city: ");
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            System.out.println("Enter family: ");
            String family = reader.readLine();
            map.put(city, family);
        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        System.out.println("Enter city live: ");
        String cityLive = reader.readLine();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (cityLive.equals(pair.getKey())) {
                String tmp = pair.getValue();
                System.out.println(tmp);
            }
        }
    }
}
