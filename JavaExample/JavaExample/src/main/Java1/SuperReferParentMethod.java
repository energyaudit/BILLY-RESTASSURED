package src.main.Java1;

/**
 * Created by byang on 2/1/2018.
 */
class Animal3{
    void eat(){System.out.println("eating...,super class method called");}
    void run(){System.out.println("running...,super class method not same name called");}
}
class Dog1 extends Animal3{
    void eat(){System.out.println("eating bread..., current class method called");}//overload parent method eat
    void bark(){System.out.println("barking...");}
    void work(){
        super.eat();//parent method
        bark();//call current method
    }
}
class TestSuper2{
    public static void main(String args[]){
        Dog1 d=new Dog1();
        d.work();//son overloaded eat method not called
        d.run();//if super and current method name different, then super method can be called directly without super.
    }}
