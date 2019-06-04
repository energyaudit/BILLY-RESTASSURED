package src.main.Java0;

/**
 * Created by byang on 2018-06-26.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorExp {
    public static void main(String args[]){
        Vector<String> vector = new Vector<String>();
        //adding elements to the end
        vector.add("Jai");
        vector.add("Mahesh");
        vector.add("Hemant");
        vector.add("Vishal");
        System.out.println(vector);
        //adding element at specified index
        vector.add(2,"Naren");
        System.out.println(vector);
        //getting elements by index
        System.out.println("Element at index 2 is: "+vector.get(2));
         //getting first element
        System.out.println("The first element of this vector is: "+vector.firstElement());
        //getting last element
        System.out.println("The last element of this vector is: "+vector.lastElement());
        //how to check vector is empty or not
        System.out.println("Is this vector empty: "+vector.isEmpty());
        //sorting
        Collections.sort(vector);
        //display elements of Vector
        System.out.println("\nVector elements after sorting in ascending order : ");
        for(int i=0; i<vector.size(); i++)
            System.out.println(vector.get(i));

        List lst = vector.subList(1,3);
       /*To get a sub list of Java Vector use List subList(int startIndex, int endIndex) method.
       This method returns an object of type List containing elements from startIndex to endIndex - 1. */

        System.out.println("\nSub list contains : ");
        for(int i=0; i< lst.size() ; i++)
            System.out.println(lst.get(i));

        ArrayList arrayList = new ArrayList();
        //Add elements to Arraylist
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");
        Collections.copy(arrayList, vector);//Copy Elements of Vector to Java ArrayList
        System.out.println("\nAfter Copy ArrayList Contains : " + arrayList);




    /* To append all elements of another Collection to Vector use boolean addAll(Collection c) method.
      It returns true if the Vector was changed by the method call. */
        ArrayList arrayL = new ArrayList();
        arrayL.add("4");
        arrayL.add("5");
        arrayL.add("6");
        Object obj = Collections.max(arrayL);
        System.out.println("Maximum Element of Java Vector is : " + obj);

        //append all elements of ArrayList to Vector
        vector.addAll(arrayL);
        System.out.println(vector);
//Replace an element at specified index of Java Vector
        vector.set(5,"REPLACED ELEMENT");
        for(int index=0; index < vector.size(); index++)
            System.out.println(vector.get(index));
    }
}