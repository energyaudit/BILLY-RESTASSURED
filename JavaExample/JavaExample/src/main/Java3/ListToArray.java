package src.main.Java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by byang on 2018-11-23.
 */

public class ListToArray {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");

        String[] array = new String[list.size()];
        list.toArray(array);//list's toArray() method to convert the list items to array items.

        System.out.println(Arrays.toString(array));

    }
}