package src.main.Java2;

import java.io.IOException;

/**
 * Created by byang on 2018-09-11.
 */

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CreateEmptyFile {

    public static void main(String[] args) {

        //create File object
     //  File file = new File("C://QA//FileIO//demo.txt");
        File file = new File("demo.txt");

    //    File fileDel = new File("C://QA//FileIO//demoDel.txt");
     //   File fileDel = new File("demoDel.txt");
        File fileDel = new File("/Billy/Testing/JavaExample/JavaExample/demo1.txt");
        List<String> lines=Arrays.asList("The first line","The second line");
        Path file1=Paths.get("the-file-name.txt");
        try {
            Files.write(file1,lines,Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        /* This method creates a new empty file specified if the file with same name does not exists.  false otherwise.*/
        boolean blnCreated = false;
        boolean blnCreated1 = false;
        try
        {
            blnCreated = file.createNewFile();
            blnCreated1 = fileDel.createNewFile();
        }
        catch(IOException ioe)
        {
            System.out.println("Error while creating a new empty file :" + ioe);
        }
        System.out.println("Was file " + file.getPath() + " created ? : " + blnCreated);
     /* If you run the same program 2 times, first time it should return true.But when we run it second time, it returns false because file was already exist.*/

      /* To check whether File object denotes a file or not, use boolean isFile() method of Java File class.
      This method returns true if the file EXISTS and its a normal file.*/
        boolean isFile = file.isFile();
        if(isFile)
            System.out.println(file.getPath() + " is a file.");
        else
            System.out.println(file.getPath() + " is not a file.");


    /*To delete a file or directory from filesystem, use boolean delete() method of File class.
     * This method returns true if file or directory successfully deleted. If  the file is a directory, it must be empty. */
        boolean blnDeleted = fileDel.delete();
        System.out.println("Was file demoDel deleted ? : " + blnDeleted);

        /* To determine whether a particular file can be read use, boolean canRead() method of Java File class.
      This method returns true IF AND ONLY IF the file exists and it can be read (file has a read permission).*/

        if(file.canRead())
        {
            System.out.println("File " + file.getPath() +" can be read");
        }
        else
        {
            System.out.println("File " + file.getPath() +" can not be read");
        }

        if(file.canWrite())
        {
            System.out.println("File " + file.getPath() +" can be written");
        }
        else
        {
            System.out.println("File " + file.getPath() +" can not be written");
        }
        System.out.println("Abstract file path is :" + file.getPath());
        System.out.println("Absolute file path is : " + file.getAbsolutePath());
    }
}