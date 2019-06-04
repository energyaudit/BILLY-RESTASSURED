package src.main.Java3;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by byang on 2018-09-13.
 */

public class TreeSetExp {

    public static void main(String[] args) {

        //create TreeSet object
        TreeSet tSet = new TreeSet();

        //add elements to TreeSet
        tSet.add("1");
        tSet.add("3");
        tSet.add("2");
        tSet.add("5");
        tSet.add("4");

    /* To get a Tail Set from Java TreeSet use, SortedSet tailSet(Object fromElement) method of Java TreeSet class.
           This method returns the portion of TreeSet containing elements grater than or equal to fromElement.*/

        SortedSet sortedSet = tSet.tailSet("2");
        System.out.println("Tail Set Contains : " + sortedSet);

        SortedSet sortedSet1 = tSet.headSet("3");
        System.out.println("Head Set Contains : " + sortedSet1);

        boolean blnRemoved = tSet.remove("2");
        System.out.println("Was 2 removed from TreeSet ? " + blnRemoved);

        // REMOVE TreeSet object
        TreeSet tSet1 = new TreeSet();

        //add elements to TreeSet object
        tSet1.add(new Integer("1"));
        tSet1.add(new Integer("2"));
        tSet1.add(new Integer("3"));

        System.out.println("TreeSet before removal : " + tSet);

        boolean blnRemoved1 = tSet1.remove(new Integer("2"));
        System.out.println("Was 2 removed from TreeSet1 ? " + blnRemoved1);
        System.out.println("TreeSet1 after removal : " + tSet1);

    }
}