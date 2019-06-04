package src.main.Java2;

/**
 * Created by byang on 2018-06-11.
 */


import java.util.Iterator;
        import java.util.Set;
        import java.util.TreeSet;

/**
 * This class is used to show the TreeSet functionality.
 * @author codesjava
 */
public class OrderedSet {
    public static void main(String args[]){
        //Create TreeSet object.
        Set treeSet = new TreeSet();

        //Add objects to the HashSet.
        treeSet.add("Roxy");
        treeSet.add("Sunil");
        treeSet.add("Sandy");
        treeSet.add("Munish");
        treeSet.add("Pardeep");

        //Print the TreeSet object.
        System.out.println("TreeSet elements:");
        System.out.println(treeSet);

        //Print the TreeSet elements using iterator.
        Iterator iterator=treeSet.iterator();
        System.out.println("TreeSet elements using iterator:");//the elements will be sorted automatically
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        boolean blnExists = treeSet.contains("Sandy");
        System.out.println("Sandy exists in TreeSet ? : " + blnExists);



    }
}
