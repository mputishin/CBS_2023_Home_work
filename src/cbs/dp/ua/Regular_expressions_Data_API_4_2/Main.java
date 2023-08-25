package cbs.dp.ua.Regular_expressions_Data_API_4_2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/cbs/dp/ua/Regular_expressions_Data_API_4_2/MyFile.txt")));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/cbs/dp/ua/Regular_expressions_Data_API_4_2/MyFile.txt")))) {

            out.writeUTF("Thanks to CBS for providing learning" +"\n");
            out.flush();
            String str = in.readUTF();

            System.out.println(str);

            Pattern pattern = Pattern.compile("to|for(\\w*)");
            Matcher matcher = pattern.matcher(str);
            str = matcher.replaceAll("Java");
            System.out.println(str);

            Files.writeString(Paths.get("src/cbs/dp/ua/Regular_expressions_Data_API_4_2/MyFile.txt"), str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
