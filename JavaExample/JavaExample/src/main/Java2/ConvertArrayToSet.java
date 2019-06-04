package src.main.Java2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by byang on 2018-11-28.
 */

public class ConvertArrayToSet {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.asList(array));

        System.out.println("Set: " + set);

        String[] array1 = {"a", "b", "c","d"};
        Set<String> set1 = new HashSet<>(Arrays.stream(array1).collect(Collectors.toSet()));

        System.out.println("Set1: " + set1);


    }
}