package src.main.Java3;

/**
 * Created by byang on 3/13/2018.
 */
public class StaticNestedClass {//It cannot access non-static data members and methods.

    static int data=30;//Static nested class cannot access non-static (instance) data member or method.
    static class Inner{
        void msg(){System.out.println("data is "+data);}//instance method msg()
        static void msg1(){System.out.println("static data is "+data);}
    }

    public static void main(String args[]){//you don't need to create the object of Outer class because nested class is static and static properties
                                            //, methods or classes,can be accessed without object.
       StaticNestedClass.Inner obj=new StaticNestedClass.Inner();//you need to create the instance of static nested class because it has instance method msg()
      obj.msg();
      //  StaticNestedClass.Inner.msg();//if run without create instance,Error:(18, 32) java: non-static method msg() cannot be referenced from a static context
        StaticNestedClass.Inner.msg1();//If you have the static member inside static nested class, you don't need to create instance of static nested class
    }
}
