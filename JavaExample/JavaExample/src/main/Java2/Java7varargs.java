package src.main.Java2;

/**
 * Created by byang on 2018-06-13.
 */

public class Java7varargs {
    static void display(int num, String... values){
        System.out.println("In display method+\n ");
        System.out.println("Number value: "+num);
        for(String value:values){
            System.out.println(value);
        }
    }
    public static void main(String args[]){
        //zero argument as Varargs
        display(100);
        //one argument as Varargs
        display(150, "Hello codesjava");
        //three arguments as Varargs
        display(250, "jai","mahesh","vivek");
    }
}