package cbs.dp.ua.IO_Strings_3_2;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/cbs/dp/ua/IO_Strings_3_2/data.txt")));
             DataInputStream  in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/cbs/dp/ua/IO_Strings_3_2/data.txt")))) {

            out.writeUTF("Thanks to CBS for providing learning");
            out.flush();
            out.close();

            System.out.println(in.readUTF());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
