package src.main.Java0;


import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by byang on 4/25/2018.
 */
class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public String toString(){//overriding the toString() method,force all return to string type
        return id+" "+name+" "+author+" "+publisher+" "+quantity;
    }
}



public class HashSetExamp {//HashSet class extends AbstractSet class which implements Set interface
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");//The Set interface inherits Collection and Iterable interfaces in hierarchical order.
        set.add("Vijay");//iterator is used when you want to remove stuff whilst you iterate over the array contents.
        set.add("Ravi");//If you don't use an iterator but simply have a for loop and inside it use the remove method you will get exceptions
        set.add("Ajay");//because the contents of the array is deleted while you iterate through.
           Iterator<String> itr=set.iterator();//Traversing elements//e.g: you might think array size is 10 at the start of the for loop
        while(itr.hasNext()){//but it wont be the case once you remove stuff(For exp:9 after delete one).
            System.out.println(itr.next());    }

        HashSet<Book> set1=new HashSet<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to HashSet
        set1.add(b1);
        set1.add(b2);
        set1.add(b3);
        //Traversing HashSet
        for(Book b:set1){//both while and for can print set
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }




        System.out.println(set1);
        Iterator<Book> itr1=set1.iterator();//Traversing elements//e.g: you might think array size is 10 at the start of the for loop
        while(itr1.hasNext()){//but it wont be the case once you remove stuff(For exp:9 after delete one).
            System.out.println(itr1.next().toString());    }//if not overwrite toString method, this print will only print the physical address.


        HashSet hSet = new HashSet();
           hSet.add(new Integer("1"));
        hSet.add(new Integer("2"));
        hSet.add(new Integer("3"));
        System.out.println("HashSet contains.." + hSet);

  /*To find maximum element of Java HashSet use, static Object max(Collection c) method of Collections class.
         This method returns the maximum element of Java HashSet according to its natural ordering.*/
        HashSet hashSet = new HashSet();
        //Add elements to HashSet
        hashSet.add(new Long("923740927"));
        hashSet.add(new Long("4298748382"));
        hashSet.add(new Long("2374324832"));
        hashSet.add(new Long("2473483643"));
        hashSet.add(new Long("32987432984"));


        Object obj = Collections.max(hashSet);
        System.out.println("Maximum Element of Java HashSet is : " + obj);



    }

}
