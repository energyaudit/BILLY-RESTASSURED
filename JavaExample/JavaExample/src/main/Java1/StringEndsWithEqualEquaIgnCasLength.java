package src.main.Java1;

/**
 * Created by byang on 2/15/2018.
 */
public class StringEndsWithEqualEquaIgnCasLength {

    public static void main(String args[]){
        String s1="java by javatpoint";
        System.out.println(s1.endsWith("t"));
        System.out.println(s1.endsWith("point"));


        String sequ1="javatpoint";
        String s2="javatpoint";
        String s3="JAVATPOINT";//String equals() method example
        String s4="python";
        System.out.println(sequ1.equals(s2));//true because content and case is same
        System.out.println(sequ1.equals(s3));//false because case is not same
        System.out.println(sequ1.equals(s4));//false because content is not same

        System.out.println(sequ1.equalsIgnoreCase(s2));//true because content and case both are same
        System.out.println(sequ1.equalsIgnoreCase(s3));//true because case is ignored
        System.out.println(sequ1.equalsIgnoreCase(s4));//false because content is not same

        System.out.println("string length is: "+sequ1.length());//10 is the length of javatpoint string
        System.out.println("string length is: "+s4.length());//6 is the length of python string
    }
    }

