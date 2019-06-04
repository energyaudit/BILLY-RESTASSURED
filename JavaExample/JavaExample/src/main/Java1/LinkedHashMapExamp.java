package src.main.Java1;

/**
 * Created by byang on 4/20/2018.
 */


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
class DogHash {
    String color;

    DogHash(String c) {
        color = c;
        System.out.println("my color is:\n"+color);
    }

    public String toString() {
        return color + " dogHash";

    }
}
public class LinkedHashMapExamp {
    public static void main(String args[]) {
        // Create and populate linked hash map
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(101,"Let us C");
        map.put(102, "Operating System");
        map.put(103, "Data Communication and Networking");
        System.out.println("Values before remove: "+ map);
        // Remove value for key 102
        map.remove(102);
        System.out.println("Values after remove: "+ map);

        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(101,"Let us C");
        map1.put(102, "Operating System");
        map1.put(103, "Data Communication and Networking");
        System.out.println("Values before remove: "+ map1);
        // Remove value for key 102
        map1.remove(102);
        System.out.println("remove by integeer ID,Values after remove: "+ map1);
        System.out.println();

        HashMap<DogHash, Integer> hashMap = new HashMap<DogHash, Integer>();
        DogHash d1 = new DogHash("red");
        DogHash d2 = new DogHash("black");
        DogHash d3 = new DogHash("white");
        DogHash d4 = new DogHash("white");
        hashMap.put(d1, 10);
        hashMap.put(d2, 15);
        hashMap.put(d3, 5);
        hashMap.put(d4, 20);
        //print size
        System.out.println(hashMap.size());
        //loop HashMap
        for (Entry<DogHash, Integer> entry : hashMap.entrySet()) {
            System.out.println("Hashmap first parameter is key, second is value:"+entry.getKey().toString() + " - " +
                    entry.getValue());
        }

        System.out.println();

        DogHash d11 = new DogHash("red");//使用HashMap，结果如下，区别在于没有保存插入顺序
        DogHash d21 = new DogHash("black");
        DogHash d31 = new DogHash("white");
        DogHash d41= new DogHash("white");
        LinkedHashMap<DogHash, Integer> linkedHashMap = new LinkedHashMap<DogHash, Integer>();
        linkedHashMap.put(d11, 10);
        linkedHashMap.put(d21, 15);
        linkedHashMap.put(d31, 5);
        linkedHashMap.put(d41, 20);
        for (Entry<DogHash, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("use linkedHashmap print to guarantee insertion order:"+entry.getKey() + " - " + entry.getValue());
        }
    }

}




