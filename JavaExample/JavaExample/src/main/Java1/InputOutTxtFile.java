package src.main.Java1;

/**
 * Created by byang on 4/23/2018.
 */
import java.io.*;
import java.util.*;
class Input2{
    public static void main(String args[])throws IOException{
//creating the FileInputStream objects for all the files
        FileInputStream fin=new FileInputStream("C:\\QA\\TESTRESULT\\TestResult2018FebToApril.txt");
        FileInputStream fin2=new FileInputStream("C:\\QA\\TESTRESULT\\TestResult2017To201802.txt");
        FileInputStream fin3=new FileInputStream("C:\\QA\\TESTRESULT\\temp1.txt");
        FileInputStream fin4=new FileInputStream("C:\\QA\\TESTRESULT\\temp.txt");
        FileOutputStream fout=new FileOutputStream("C:\\QA\\TESTRESULT\\testout.txt");
//creating Vector object to all the stream
        Vector v=new Vector();
        v.add(fin);
        v.add(fin2);
        v.add(fin3);
        v.add(fin4);
//creating enumeration object by calling the elements method
        Enumeration e=v.elements();
        System.out.println("use vector elements to print the variation length output");
//passing the enumeration object in the constructor
        SequenceInputStream bin=new SequenceInputStream(e);
        int i=0;
        while((i=bin.read())!=-1){
            fout.write(i);
            System.out.print((char)i);   }
        bin.close();
        fin.close();
        fin2.close();
        fout.close();
    }   }

