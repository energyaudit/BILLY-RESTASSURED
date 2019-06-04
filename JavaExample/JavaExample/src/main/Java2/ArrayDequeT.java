package src.main.Java2;

/**
 * Created by byang on 2018-06-11.
 */

import java.util.ArrayDeque;
import java.util.Deque;
        import java.util.Iterator;

/**
 * This class is used to show the ArrayDeque functionality.
 * @author codesjava
 */
public class ArrayDequeT {//Deque (pronounce it as Deck because that’s how the cool kids do) interface. It is a double ended queue
    public static void main(String args[]){
        //Create ArrayDeque  object.
        Deque arrayDeque  = new ArrayDeque();

        //Add objects to the ArrayDeque.
        arrayDeque.add("Gourav");
        arrayDeque.add("Neeraj");
        arrayDeque.add("Deepak");
        arrayDeque.add("Mohan");
        arrayDeque.add("Parmender");

        //Print the ArrayDeque object.
        System.out.println("ArrayDeque elements:");
        System.out.println(arrayDeque);
        System.out.println();

        //Print the ArrayDeque elements using iterator.
        Iterator iterator1=arrayDeque.iterator();
        System.out.println("ArrayDeque elements " +
                "using iterator:\n");
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        //Print the first element of the ArrayDeque.
        System.out.println("\nFirst element: "
                + arrayDeque.getFirst());

        //Print the last element of the ArrayDeque.
        System.out.println("Last element: "
                + arrayDeque.getLast());

        //Remove the first element of the ArrayDeque.
        arrayDeque.pollFirst();

        //Remove the last element of the ArrayDeque.
        arrayDeque.pollLast();
        //Print the first element of the ArrayDeque.
        System.out.println("\nFirst element after Poll: "
                + arrayDeque.getFirst());

        //Print the last element of the ArrayDeque.
        System.out.println("Last element after Poll: "
                + arrayDeque.getLast());

        arrayDeque.peekFirst();
        arrayDeque.peekLast();
        //Print the first element of the ArrayDeque.
        System.out.println("\nFirst element after peek: "
                + arrayDeque.getFirst());

        //Print the last element of the ArrayDeque.
        System.out.println("Last element  after peek: "
                + arrayDeque.getLast());

        //Print the ArrayDeque object.
        System.out.println("\nArrayDeque elements " +
                "after manipulation:\n");
        System.out.println(arrayDeque);

        //Print the ArrayDeque elements using iterator.
        Iterator iterator2=arrayDeque.iterator();
        System.out.println("\nArrayDeque elements after " +
                "manipulation using iterator:\n");
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
