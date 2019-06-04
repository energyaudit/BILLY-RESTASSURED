package src.main.Java2;

import java.io.File;

/**
 * Created by byang on 2018-09-11.
 */

public class ConstructFilePath {

    public static void main(String[] args) {
        String strFileSeparator = System.getProperty("file.separator");

        System.out.println("File separator is : " + strFileSeparator);
           String filePath = File.separator + "JavaExamples" + File.separator + "IO";

        //create new File object
        File file = new File(filePath);
       /* Please note that creating file object DOES NOT actually create a file. It DOES NOT have any effects on the filesystem. */

        //display file path using getPath() method of File class.
        System.out.println("File path is : " + file.getPath());

    }
}