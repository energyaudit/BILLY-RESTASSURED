package src.main.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class MergeOut {

    public static void inputStr(String in1, String in2, String in3, String in4, String out) {

        try {
            //creating the FileInputStream objects for all the files
            FileInputStream fin = new FileInputStream(in1);
            FileInputStream fin2 = new FileInputStream(in2);
            FileInputStream fin3 = new FileInputStream(in3);
            FileInputStream fin4 = new FileInputStream(in4);
            FileOutputStream fout = new FileOutputStream(out);
//creating Vector object to all the stream
            Vector v = new Vector();
            v.add(fin);
            v.add(fin2);
            v.add(fin3);
            v.add(fin4);
//creating enumeration object by calling the elements method
            Enumeration e = v.elements();
            System.out.println("use vector elements to print the variation length output");
//passing the enumeration object in the constructor
            SequenceInputStream bin = new SequenceInputStream(e);
            int i = 0;
            while ((i = bin.read()) != -1) {
                fout.write(i);
                System.out.print((char) i);
            }
            bin.close();
            fin.close();
            fin2.close();
            fout.close();
        } catch (Exception e) {
            System.out.println(e);

        }

    }
}

