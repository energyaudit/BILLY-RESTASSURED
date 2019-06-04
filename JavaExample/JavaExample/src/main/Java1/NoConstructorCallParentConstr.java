package src.main.Java1;

/**
 * Created by byang on 2/2/2018.
 */
class Animal6{//The super keyword can also be used to invoke the parent class constructor.
    Animal6(){System.out.println("adds super() as the first statement automatically: animal is created");}//constructor
}
class Dog2 extends Animal6{
    Dog2(){
        System.out.println("current sub class :dog is created");//constructor
    }
}
class TestSuper4{
    public static void main(String args[]){
        Dog2 d=new Dog2();//adds super() as the first statement automatically
    }}