package src.main.Java1;

/**
 * Created by byang on 2/5/2018.
 */
//Creating interface that has 4 methods
interface AbstractClass{
    void a();//bydefault, public and abstract
    void b();
    void c();
    void d();
}

//Creating abstract class that provides the implementation of one method of A interface
abstract class BAbstract implements AbstractClass{
    public void c(){System.out.println("abstract class can be used to implement interface: I am C");}
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class MAbstract extends BAbstract{//If a class extends abstract class than either it has to provide implementation of all abstract methods or declare this class as abstract class.
    public void a(){System.out.println("normal class extend abstract class then implement interface:I am a");}//overridden method, provide implementation

    public void b(){System.out.println("normal class extend abstract class then implement interface:I am b");}// of abstract method according to your need.
    public void d(){System.out.println("normal class extend abstract class then implement interface:I am d");}
}

//Creating a test class that calls the methods of A interface
class TestAbstract5{
    public static void main(String args[]){
        AbstractClass a=new MAbstract();
        a.a();
        a.b();
        a.c();
        a.d();
    }}
