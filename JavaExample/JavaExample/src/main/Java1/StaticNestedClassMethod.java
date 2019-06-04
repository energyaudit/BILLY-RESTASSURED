package src.main.Java1;

/**
 * Created by byang on 3/5/2018.
 */
public class StaticNestedClassMethod {


    static int data=30;
    static class Inner{//static nested inner
        static void msg(){System.out.println("access all the members (data members and methods) of outer class including private,data is "+data);}
    }
    public static void main(String args[]){//static nested class example with static method
        StaticNestedClassMethod.Inner.msg();//no need to create the instance of static nested class
    }
}
