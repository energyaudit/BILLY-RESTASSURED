package src.main.Java1;

/**
 * Created by byang on 4/20/2018.
 */

import java.util.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.HashMap;

public class HashTable {
    public static void main(String args[]) {
        // create hash table
        Hashtable htable = new Hashtable();
        // put values into the table
        htable.put(1, "A");
        htable.put(2, "B");
        htable.put(3, "C");
        htable.put(4, "D");

        // check if table contains key "3"
        boolean isavailable = htable.containsKey(3);

        // display search result
        System.out.println("Hash table contains key '3': " + isavailable);
        boolean blnExists = htable.containsValue("D");
        System.out.println("VALUE D exists in HashMap ? : " + blnExists);

        //Get iterator
        Set set = htable.entrySet();//use entryset of hashtable to get iterator
        Iterator iterator = set.iterator();

        //Print the Hashtable elements using iterator.
        System.out.println("Hashtable elements using iterator:");
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            System.out.println("Key: " + mapEntry.getKey() +
                    ", " + "Value: " + mapEntry.getValue());
        }

        //Create Java Hashtable from HashMap example

        HashMap hMap = new HashMap();

        //populate HashMap
        hMap.put("1","One");
        hMap.put("2","Two");
        hMap.put("3","Three");

        Hashtable ht = new Hashtable();
        ht.putAll(hMap);

        //display contents of Hashtable
        System.out.println("Hashtable contents after copy");
        Enumeration e = ht.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());


    }
}
