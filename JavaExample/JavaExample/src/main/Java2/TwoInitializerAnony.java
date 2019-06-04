package src.main.Java2;

/**
 * Created by byang on 2018-06-06.
 */

class Display3 {
    int a, b, c;

    //First Anonymous or instance initializer Block
    {
        System.out.println("First AnonumousBlock called.");
        a = 10;
    }

    //Second Anonymous or instance initializer Block
    {
        System.out.println("Second AnonumousBlock called.");
        b = 20;
    }
    static {// static Anonymous Block is executed only once.And it will execute first even code after non-static initializer
        System.out.println("Static AnonumousBlock called.");
    }


    //default constructor
    Display3(){
        System.out.println("default constructor called.");
    }

    //one argument constructor
    Display3(int num){
        System.out.println("one parameter constructor called.");
        c = num;
    }

    //method to display values
    public void display3(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

public class TwoInitializerAnony {
    public static void main(String args[]){
        Display3 obj1 = new Display3();
        obj1.display3();

        Display3 obj2 = new Display3(30);
        obj2.display3();
    }
}