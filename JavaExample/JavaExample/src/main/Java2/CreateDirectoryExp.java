package src.main.Java2;

/**
 * Created by byang on 2018-09-11.
 */


import java.io.*;

public class CreateDirectoryExp {

    public static void main(String[] args) {

        //create file object
        File dir = new File("C://QA//FileIO//DemoDirectory");//only last folder is empty, if FileIO folder is not there then will fail.
    /* To create directory in the filesystem use, boolean mkdir() method of Java File class.
     This method returns true if the directory was created successfully, false otherwise.*/

        boolean isDirectoryCreated = dir.mkdir();

        if(isDirectoryCreated)
            System.out.println("Directory created successfully");
        else
            System.out.println("Directory was not created successfully");

        File dir1= new File("C://QA//FileIO//Parent1//Parent2//DemoDir");

    /*To create directory along with the required nonexistent parent directories use, boolean mkdirs() method of Java File class.
     there is "s" at end of mkdir*/

        boolean isDir1Created = dir1.mkdirs();

        if(isDir1Created)
            System.out.println("Directory created along with required nonexistent parent directories");
        else
            System.out.println("Failed to create directory");
/* To check whether File object denotes a directory or not, use boolean isDirectory() method of Java File class.
    This method returns true if the directory EXISTS and its a directory.*/
        boolean isDirectory = dir.isDirectory();
        if(isDirectory)
            System.out.println(dir.getPath() + " is a directory.");
        else
            System.out.println(dir.getPath() + " is not a directory.");

    }
}
