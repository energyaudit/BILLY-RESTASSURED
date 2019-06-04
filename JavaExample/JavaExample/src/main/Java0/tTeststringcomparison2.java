package src.main.Java0;

/**
 * Created by byang on 2/9/2018.
 */
public class tTeststringcomparison2 {//The String equals() method compares ,compares values of string for equality
    public static void main(String args[]){
        String s1="Sachin";
        String s2="SACHIN";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true
    }
}
