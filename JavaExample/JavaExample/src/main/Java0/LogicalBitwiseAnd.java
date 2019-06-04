package src.main.Java0;

/**
 * Created by byang on 1/19/2018.
 */
public class LogicalBitwiseAnd
{
    public static void main(String args[]){
        int a=10;
        int b=5;
        int c=20;
        System.out.println("Logical &&,The logical && operator doesn't check second condition if first condition is false.so will not calculate a++");
        System.out.println(a<b&&a++<c);//false && true = false, Logical &&,The logical && operator doesn't check second condition if first condition is false. It checks second condition only if first one is true.
        System.out.println(a);//10 because second condition is not checked

        System.out.println("\nThe bitwise & operator always checks both conditions whether first condition is true or false.so will calculate a++");
        System.out.println(a<b&a++<c);//false && true = false,Bitwise ,&--The bitwise & operator always checks both conditions whether first condition is true or false.
        System.out.println(a);//11 because second condition is checked
    }
}
