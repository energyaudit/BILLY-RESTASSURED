package src.main.Java1;

/**
 * Created by byang on 4/20/2018.
 */
import java.util.*;
public class CollectionsExample {
    public static void main(String a[]){
        List<String> list = new ArrayList<String>();
        list.add("C");          list.add("Core Java");          list.add("Advance Java");//add only one parameter, add all: greater or equal 2 parameters
        System.out.println("ArrayList is a collection,Initial collection value:"+list);
        Collections.addAll(list, "Servlet","JSP");
        System.out.println("add all method,string as parameters,After adding elements collection value:"+list);
        String[] strArr = {"C#", ".Net"};
        Collections.addAll(list, strArr);//add string array
        System.out.println("add all method with array,string array as parameters,After adding array collection value:"+list);

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(46);          list1.add(67);          list1.add(24);          list1.add(16);          list1.add(8);          list1.add(12);
        System.out.println("Value of maximum element from the collection:collection max method : "+Collections.max(list1));

}
}

