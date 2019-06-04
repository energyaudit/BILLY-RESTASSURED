package src.main.Java2;

/**
 * Created by byang on 2018-06-12.
 */


import java.util.Iterator;
        import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class is used to show the LinkedList functionality.
 * @author codesjava
 */
public class LinkedListExp {
    public static void main(String args[]){
        //Create LinkedList object.
        LinkedList linkedList = new LinkedList();

        //Add objects to the HashSet.
        linkedList.add("Amani");
        linkedList.add("Prabhjot");
        linkedList.add("Nidhi");
        linkedList.add("Vandana");
        linkedList.add("Poonam");

        //Size of the LinkedList object.
        System.out.println("Size: "
                + linkedList.size());

        //Print the LinkedList object.
        System.out.println("LinkedList elements:");
        System.out.println(linkedList);

        //Print the LinkedList elements using iterator.
        Iterator iterator1=linkedList.iterator();
        System.out.println("LinkedList elements " +
                "using iterator:");
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        //Add an object at the specific position.
        linkedList.add(2,"Jagdeep");

        //Remove a element from a specific position.
        linkedList.remove(3);

        //Remove last element.
        linkedList.removeLast();

        //Size of the LinkedList object.
        System.out.println("Size after manipulation: "
                + linkedList.size());

        //Print the LinkedList object.
        System.out.println("LinkedList elements " +
                "after manipulation:");
        System.out.println(linkedList);

        //Print the LinkedList elements using iterator.
        ListIterator iterator2= (ListIterator) linkedList.iterator();//cast iterator to listiterator,so it can output from back direction
        System.out.println("LinkedList elements after " +
                "manipulation using iterator:");
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
//print out previous and next index
        System.out.println("Previous Index is : " + iterator2.previousIndex());
        System.out.println("Next Index is : " + iterator2.nextIndex());

        System.out.println("\n Print from back to front\n");
        while(iterator2.hasPrevious()){
            System.out.println(iterator2.previous());
        }
//Replace an Element of LinkedList Java example
        linkedList.set(3, "Replaced");
        System.out.println("After replacing 4, LinkedList contains : " + linkedList);

    }
}
