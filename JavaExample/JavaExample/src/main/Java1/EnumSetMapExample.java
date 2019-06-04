package src.main.Java1;

/**
 * Created by byang on 4/20/2018.
 */
import java.util.*;

public class EnumSetMapExample {
    public enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public static void main(String[] args) {
        Set<Days> set = EnumSet.of(Days.TUESDAY, Days.WEDNESDAY);
        // Traversing elements
        System.out.println("EnumSet:type is enum Days,iter is set iterator able to use in loop,Traversing elements");
        Iterator<Days> iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

        EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
      //  map.put(Days.Monday, "1");//will get  java: cannot find symbol, symbol:   variable Monday,
        map.put(Days.MONDAY, "1");//location: class src.main.Java1.EnumSetExample.Days,because Java is case sensitive.
        map.put(Days.TUESDAY, "2");
        map.put(Days.WEDNESDAY, "3");
       // map.put(Days.Thursday, "4");///will get  java: cannot find symbol, symbol:because Java is case sensitive.
        map.put(Days.THURSDAY, "4");

        // print the map
        System.out.println("\nEnumMap<Days, String> ket type is enum Days,value is string, " +
                "\nTraversing elements for(Map.Entry m:map.entrySet()){//Map.Entry interface:provides the facility/methods to work with a map entry.");
        for(Map.Entry m:map.entrySet()){//Map.Entry interface:provides the facility/methods to work with a map entry.
            System.out.println(m.getKey()+" "+m.getValue());       }


    }
}

