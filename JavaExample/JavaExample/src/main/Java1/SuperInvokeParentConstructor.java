package src.main.Java1;

/**
 * Created by byang on 2/2/2018.
 */
class Animal5{
    Animal5(){System.out.println("animal is created,Super class constructor called first by sub class new keyword.");}
}
class Dog extends Animal5{
    Dog(){
        super();//call parent constructor
        System.out.println("use super to call super constructor,dog is created,Current class constructor called.\n");
    }
}

class DogNosuper extends Animal5{
    DogNosuper(){
       //call parent constructor automatically without
        System.out.println("dog is created,Current class DogNosuper constructor called.");
    }
}

class TestSuper3{
    public static void main(String args[]){
        Dog d=new Dog();
        DogNosuper d2=new DogNosuper();
    }}