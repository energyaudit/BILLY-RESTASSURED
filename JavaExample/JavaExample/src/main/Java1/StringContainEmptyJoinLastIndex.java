package src.main.Java1;

/**
 * Created by byang on 2/15/2018.
 */
public class StringContainEmptyJoinLastIndex {

    public static void main(String args[]){
        String name="what do you know about me";
        System.out.println(name.contains("do you know"));
        System.out.println(name.contains("about"));
        System.out.println(name.contains("hello"));


        String sEmpty1="";
        String sEmpty2="javatpoint";
        System.out.println(sEmpty1.isEmpty());//Java String isEmpty() method
        System.out.println(sEmpty2.isEmpty());


        String joinString1=String.join("-","welcome","to","javatpoint");//string join() method returns a string joined with given delimiter.
        System.out.println(joinString1);//In string join method, delimiter is copied for each elements.


        String sLastIndex1="this is index of example";//there are 2 's' characters in this sentence
        int index1=sLastIndex1.lastIndexOf('s');//returns last index of 's' char value,returns last index of the given character value or substring.
        System.out.println(index1);//6,If it is not found, it returns -1. The index counter starts from zero.

    }
}
