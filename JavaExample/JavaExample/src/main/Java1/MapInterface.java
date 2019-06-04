package src.main.Java1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by byang on 4/20/2018.
 */

public class MapInterface{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");    map.put(101,"Vijay");    map.put(102,"Rahul");
        for(Map.Entry m:map.entrySet()){
            System.out.println("key is integer,valus is string:"+m.getKey()+" "+m.getValue());    }   }  }//Object getKey()	It is used to obtain key. Object getValue()	It is used to obtain value.



