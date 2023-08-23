package cbs.dp.ua.IO_Strings_3_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws IOException {

        URL url = new URL("http://rogerdudler.github.io/git-guide/index.ru.html");
        URLConnection urlc = url.openConnection();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(urlc.getInputStream(), "UTF8"));

        StringBuilder builder = new StringBuilder();

        int byteRead;
        while ((byteRead = buffer.read()) != -1) {
            builder.append((char) byteRead);
        }
        buffer.close();
        String tmp = builder.toString();
        String text = new String(tmp.toCharArray(), 66, 72);

        System.out.println(text);
        System.out.println(text.length());
        System.out.println(text.substring(0, 36));
        System.out.println(text.substring(37));
    }
}
