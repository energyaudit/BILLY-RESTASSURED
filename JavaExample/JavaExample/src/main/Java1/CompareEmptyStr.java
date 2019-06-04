package src.main.Java1;

/**
 * Created by byang on 2/15/2018.
 */
public class CompareEmptyStr {

    public static void main(String args[]){
        String s1="hello";
        String s2="";
        String s3="me";
        System.out.println(s1.compareTo(s2));//5
        System.out.println(s2.compareTo(s3));//-2
    }
}
