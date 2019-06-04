package src.main.Java2;

/**
 * Created by byang on 2018-09-12.
 */

import java.io.*;

public class ListDirectoryContent {

    public static void main(String[] args) {
        //create file object
        File file = new File("C://QA//FileIO");
      /* To list contents of a directory use,String[] list() method of Java File class.This method returns an array of Strings containing name of files and
     * sub-directories. It reuturns an empty array, if directory is empty,and null if file does not denotes a directory.*/
        String[] files = file.list();
        System.out.println("Listing contents of " + file.getPath());
        for(int i=0 ; i < files.length ; i++)
        {
            System.out.println(files[i]);
        }
    }
}