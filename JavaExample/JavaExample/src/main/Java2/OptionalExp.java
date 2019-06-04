package src.main.Java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Created by byang on 2018-08-22.
 */
public class OptionalExp {
    private static List<String> nameList = new ArrayList<String>();
    static {
        nameList.add("Shamik");
        nameList.add("Samir");
        nameList.add("Swastika");
    }
    /*public String findName(String nameToFind){
    return nameList.contains(nameToFind)?nameList.get(nameList.indexOf(nameToFind)):null; }*/
    public Optional <String> findName(String nameToFind) {
        return nameList.contains(nameToFind) ? Optional.of(nameList.get(nameList.indexOf(nameToFind))) : Optional.empty();
    }//Optional object is used to represent null with absent value.
    public static void main(String[] args) {
        OptionalExp test = new OptionalExp();
        Optional <String> searchedName = test.findName("Mayukh");
        if (searchedName.isPresent()) {
            System.out.println("HI," + searchedName.get());
        } else {
            System.out.println("Name not found");
        }

        OptionalInt maxOdd = IntStream.of(10, 20, 30).filter(n -> n % 2 == 1).max();
        if (maxOdd.isPresent()) {
            int value = maxOdd.getAsInt();
            System.out.println("Maximum odd  integer is " + value);
        } else {
            System.out.println("Maximum odd  integer in Stream is  empty.");
        }
    }
}