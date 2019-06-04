package src.main.Java2;

/**
 * Created by byang on 2018-06-06.
 */


class Display2 {
    int a, b;

    //Anonymous or instance initializer Block
    {
        System.out.println("Anonymous or instance initializer Block called.Called each time new");
        a = 10;
    }

    //default constructor
    Display2(){
        System.out.println("default constructor called.b is not initialized");
    }

    //one argument constructor
    Display2(int num){
        System.out.println("one parameter constructor called.");
        b = num;
    }

    //method to display values
    public void display1(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

public class InstanceInitializer {
    public static void main(String args[]){
        Display2 obj1 = new Display2();
        obj1.display1();

        Display2 obj2 = new Display2(20);
        obj2.display1();
    }
}
