package src.main.Java0;

/**
 * Created by byang on 1/29/2018.
 */
class A{// this() constructor call can be used to invoke the current class constructor.
    int i=8;
    A(){//method same name as class,constructor1
        this(5);//Calling parameterized constructor from default constructor by this(5),It is used to reuse the constructor. In other words, it is used for constructor chaining.
        System.out.println("Calling parameterized constructor from default constructor by this(5),:hello a");
    }
    A(int x){//method same name as class,constructor2,difference is parameterized
        System.out.println("parameter constructor,x="+x);
    }//The real purpose of Constructor Chaining is that you can pass parameters through a bunch of different constructors,
    {
        System.out.println("\nThis is initialization block:i="+i);
    }
 class TestThis6{//but only have the initialization done in a single place.
 }//If we don’t chain, and two different constructors require a specific parameter,
    public static void main(String args[]){//you will have to initialize that parameter twice,
        A a=new A();//and when the initialization changes, you’ll have to change it in every constructor, instead of just the one.
        A a1=new A();
    }
}