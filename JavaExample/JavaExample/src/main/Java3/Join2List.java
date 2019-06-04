package src.main.Java3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Created by byang on 2018-11-23.
 */

public class Join2List {

    public static void main(String[] args) {
//method 1 : addall
        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");

        List<String> list2 = new ArrayList<String>();
        list2.add("c");
        list2.add("d");

        List<String> joined = new ArrayList<String>();

        joined.addAll(list1);
        joined.addAll(list2);

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("joined: " + joined);

//use stream
        List<String> joined2 =  Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        System.out.println("joined2: " + joined2);
    }
}