package src.main.Java1;

/**
 * Created by byang on 2/2/2018.
 */
class Bike{// final method is inherited but you cannot override it,Because class bike is not final so it can be inherited
    Bike()//constructor
    {
        System.out.println("Subclass will call parent/super constructor first,super constructor first");
    }
    final void run(){System.out.println("subclass  cannot override method-run ,final method is inherited but you cannot override it,running...");}
}
class Honda2 extends Bike{//subclass  cannot override method-run ,final method is inherited but you cannot override it.
    public static void main(String args[]){
        new Honda2().run();
    }
}
