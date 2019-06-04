package src.main.Java3;

/**
 * Created by byang on 3/13/2018.
 */
public class StaticMthdStaticNestedClass {

    static int data=30;//If you have the static member inside static nested class, you don't need to create instance of static nested class.
    static class Inner{
        static void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        StaticMthdStaticNestedClass.Inner.msg();//no need to create the instance of static nested class
    }
}
