package src.main.Java2;

/**
 * Created by byang on 2018-06-12.
 */


import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Iterator;

/**
 * This class is used to show the sorting functionality.
 * @author codesjava
 */
public class CollectionSortExp {
    public static void main(String args[]){
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();

        //Add string objects to the ArrayList.
        arrayList1.add("Amani");
        arrayList1.add("Prabhjot");
        arrayList1.add("Nidhi");
        arrayList1.add("Vandana");
        arrayList1.add("Poonam");

        //Add Wrapper objects to the ArrayList.
        arrayList2.add(Integer.valueOf(12));
        arrayList2.add(Integer.valueOf(34));
        arrayList2.add(Integer.valueOf(14));
        arrayList2.add(Integer.valueOf(56));
        arrayList2.add(Integer.valueOf(4));

        //Print the Collection string elements before sorting.
        Iterator iterator1=arrayList1.iterator();
        System.out.println("Collection string elements " +
                "before sorting:");
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        //Call the Collections sort method for sorting
        Collections.sort(arrayList1);

        //Print the Collection string elements before sorting.
        Iterator iterator2=arrayList1.iterator();
        System.out.println("Collection string elements " +
                "after sorting:");
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        //Print the Collection Wrapper elements before sorting.
        Iterator iterator3=arrayList2.iterator();
        System.out.println("Collection Wrapper elements " +
                "before sorting:");
        while(iterator3.hasNext()){
            System.out.println(iterator3.next());
        }

        //Call the Collections sort method for sorting
        Collections.sort(arrayList2);

        //Print the Collection Wrapper elements before sorting.
        Iterator iterator4=arrayList2.iterator();
        System.out.println("Collection Wrapper elements " +
                "after sorting:");
        while(iterator4.hasNext()){
            System.out.println(iterator4.next());
        }

    }
}