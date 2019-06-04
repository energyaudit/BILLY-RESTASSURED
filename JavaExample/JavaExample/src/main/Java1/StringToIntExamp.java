package src.main.Java1;

/**
 * Created by byang on 4/23/2018.
 */
public class StringToIntExamp {

    public static void main(String args[]){
        String s="200";//In Java, strings are objects, not primitive types such as int, double, char, and boolean
        int i=Integer.parseInt(s);
        System.out.println(s+100);//200100 because + is string concatenation operator
        System.out.println(i+100);//300 because + is binary plus operator
    }}

