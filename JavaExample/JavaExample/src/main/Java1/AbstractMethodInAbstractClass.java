package src.main.Java1;

/**
 * Created by byang on 2/5/2018.
 */
abstract class Bike8{
    abstract void run();// Bike the abstract class that contains only one abstract method run. It implementation is provided by the Honda class.
}
class Honda4 extends Bike8{//The reason use abstract method is : multiple objects can share some behavior, but not all behavior.
    void run(){System.out.println("extended abstract class method:running safely..");}

    public static void main(String args[]){
        Bike8 obj = new Honda4();
        obj.run();
    }
}
