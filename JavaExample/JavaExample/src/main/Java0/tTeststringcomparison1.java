package src.main.Java0;

/**
 * Created by byang on 2/9/2018.
 */
public class tTeststringcomparison1 {//String equals() method compares values of string for equality
    public static void main(String args[]){
        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
        String s4="Saurav";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
    }
}
