package cbs.dp.ua.IO_Strings_3_4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the text: ");
        String txt = reader.readLine();
        ChangeFile chFile = new ChangeFile(txt);

        chFile.addTextToFile(txt);

        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/cbs/dp/ua/IO_Strings_3_4/MyFile.txt")))) {

            System.out.println(in.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
