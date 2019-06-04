package src.main.Java0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by byang on 2018-09-12.
 */

public class ArraylistFrmEnum {

    public static void main(String[] args) {
        //create a Vector object
        Vector v = new Vector();
        //Add elements to Vector
        v.add("A");
        v.add("B");
        v.add("D");
        v.add("E");
        v.add("F");
        System.out.println("Vector contains : " + v);
    /* To create ArrayList from any Enumeration, use static ArrayList list(Enumeration e) method of Collections class. */
        //Get Enumeration over Vector
        Enumeration e = v.elements();
        //Create ArrayList from Enumeration of Vector
        ArrayList aList = Collections.list(e);
        System.out.println("Arraylist contains : " + aList);

    }
}