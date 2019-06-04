package src.main.Java1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by byang on 2018-09-12.
 */

public class ReplaceallArraylist {

    public static void main(String[] args) {

        //create an ArrayList object
        ArrayList arrayList = new ArrayList();

        //Add elements to Arraylist
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("D");

        System.out.println("ArrayList Contains : " + arrayList);

    /* To replace all occurrences of specified element of Java ArrayList use,
      static boolean replaceAll(List list, Object oldVal, Object newVal) method
      of Collections class.

      This method returns true if the list contained one more elements replaced.

    */

        Collections.replaceAll(arrayList, "A", "Replace All");

        System.out.println("After Replace All, ArrayList Contains : " + arrayList);
    }
}