package src.main.Java2;

/**
 * Created by byang on 2018-06-01.
 */
public class MainOverload {
    //overloaded main method with one parm
    public static void main(int num1){
        System.out.println(num1);
    }

    //overloaded main method with two parm
    public static void main(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static void main(String args[]){
        //method call
        main(20);
        main(10, 20);
    }
}
