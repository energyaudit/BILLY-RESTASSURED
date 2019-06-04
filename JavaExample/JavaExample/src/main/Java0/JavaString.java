package src.main.Java0;

/**
 * Created by byang on 2/9/2018.
 */
public class JavaString {

    public static void main(String args[]){
        String s1="java";//creating string by java string literal
        char ch[]={'s','t','r','i','n','g','s'};//An array of characters works same as java string
        String s2=new String(ch);//converting char array to string
        String s3=new String("example");//creating java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
