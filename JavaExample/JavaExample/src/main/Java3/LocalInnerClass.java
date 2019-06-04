package src.main.Java3;

/**
 * Created by byang on 3/2/2018.
 */
public class LocalInnerClass {

    private int data=30;//instance variable
    void display(){
        class Local{//A class i.e. created inside a method is called local inner class in java.
            void msg(){System.out.println(data);}
        }
        Local l=new Local();//If you want to invoke the methods of local inner class, you must instantiate this class inside the method
        l.msg();
    }
    public static void main(String args[]){
        LocalInnerClass obj=new LocalInnerClass();
        obj.display();// invoke the methods of local inner class
    }
}
/*A static nested class is effectively the same as using a separate class file except you put it inside another one.

If it is not static however it is called an inner class. The inner class has access to all members of its enclosing class. In case of a static nested class they can exist without the other being instantiated but an inner class can only exist within the instance of its enclosing class.

You should pay attention to the naming of the concepts. So in short:

static nested class: almost same as a normal class but enclosed in an other one. Has access to  public membrs
inner class: Can only exist withing the instance of its enclosing class. Has access to all members.
local class: class declared in a block. It is like an inner class (has access to all members) but it also has access to local scope.*/
