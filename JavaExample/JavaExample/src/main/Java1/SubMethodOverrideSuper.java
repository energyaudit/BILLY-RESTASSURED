package src.main.Java1;

/**
 * Created by byang on 2/1/2018.
 */
class Vehicle{
    Vehicle()//constructor
    {
        System.out.println("Subclass will call parent/super constructor first,super constructor first");
    }
    void run(){System.out.println("super run: Vehicle is running");}
}
class Bike2 extends Vehicle{
    void run(){System.out.println("sub run overwrite: Bike is running safely");}

    public static void main(String args[]){

        Vehicle objVl=new Vehicle();
        objVl.run();

        Bike2 obj = new Bike2();
        obj.run();    }}
