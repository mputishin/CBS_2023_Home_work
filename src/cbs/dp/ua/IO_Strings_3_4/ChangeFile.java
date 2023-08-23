package cbs.dp.ua.IO_Strings_3_4;

import java.io.*;

public class ChangeFile {

    private String pathToFile;

    public ChangeFile( String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public void addTextToFile (String text) {

        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/cbs/dp/ua/IO_Strings_3_4/MyFile.txt")))) {

            out.writeUTF(text);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
