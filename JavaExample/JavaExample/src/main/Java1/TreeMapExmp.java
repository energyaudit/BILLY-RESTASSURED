package src.main.Java1;

import java.util.*;

/**
 * Created by byang on 4/25/2018.
 */
public class TreeMapExmp {

    public static void main(String args[]){
        TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
        hm.put(100,"Amit");//TreeMap maintains key ascending order,HashMap maintains no order
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");//even 101 is put after 102 it will still print out before 102
        hm.put(103,"Rahul");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());    }
        System.out.println("Lowest key Stored in Java TreeMap is : "
                + hm.firstKey());
        System.out.println("Highest key Stored in Java TreeMap is : "
                + hm.lastKey());
        System.out.println();
//Set view of Keys
        Set st = hm.keySet();
        System.out.println("Set created from TreeMap Keys contains :");
        Iterator itr = st.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        System.out.println("\nCompare HashMap ");
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(100,"Amit");
        hashMap.put(102,"Ravi");
        hashMap.put(101,"Vijay");
        hashMap.put(103,"Rahul");
      //  List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(hashMap.entrySet());
      //  Collections.shuffle(list);
        for (Map.Entry<Integer,String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " +
                    entry.getValue());
        }

        // To get a Head Map from Java TreeMap use,        SortedMap headMap(Object toKey) method of Java TreeMap class.
        //        This method returns the portion of TreeMap whose keys are less than toKey.
        SortedMap sortedMap = hm.headMap(102);
        System.out.println("\nHead Map Contains : " + sortedMap);
//SortedMap tailMap(Object fromKey) method of Java TreeMap class.
// This method returns the portion of TreeMap whose keys are grater than or equal to fromKey.
        SortedMap sortedMap1 = hm.tailMap(101);
        System.out.println("Tail Map Contains : " + sortedMap1);


    }

}
