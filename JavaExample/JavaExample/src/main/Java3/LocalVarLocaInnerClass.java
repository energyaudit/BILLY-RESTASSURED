package src.main.Java3;

/**
 * Created by byang on 3/2/2018.
 */
public class LocalVarLocaInnerClass {

    private int data=30;//instance variable
    void display(){
        int value=50;//local variable must be final till jdk 1.7 only,Since JDK 1.8,, it is possible to access the non-final local variable in local inner class.
        class Local{//A local class is declared locally within a block of Java code,Typically, a local class is defined within a method,
        // but it can also be defined within a static initializer or instance initializer of a class
            void msg(){System.out.println(value);}
        }
        Local l=new Local();//it is possible to access the non-final local variable in local inner class
        l.msg();
    }
    public static void main(String args[]){
        LocalVarLocaInnerClass obj=new LocalVarLocaInnerClass();
        obj.display();
    }
}
