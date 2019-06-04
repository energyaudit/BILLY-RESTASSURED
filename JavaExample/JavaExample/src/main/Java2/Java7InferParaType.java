package src.main.Java2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by byang on 2018-06-25.
 */

public class Java7InferParaType {
    public static void main(String args[]){
        //Prior to Java 7
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        for (Integer element : list1) {
            System.out.println(element);
        }
        //In Java 7, Only diamond is used,Java 7 introduced the diamond operator (<>) to reduce the verbosity of generics code. For instance, instead of having to
        // declare a List's type in both its declaration and its constructor, you can now simplify the constructor declaration with <>, and the compiler will infer the type.
        List<Integer> list2 = new ArrayList<>();//We can replace the type arguments with an empty set of type parameters (<>) diamond.
        list2.add(10);
        for (Integer element : list2) {
            System.out.println(element);
        }
    }
}
