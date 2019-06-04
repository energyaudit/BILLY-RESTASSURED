package src.main.Java0;

/**
 * Created by byang on 2018-11-19.
 */

class Animal{
    void eat(){System.out.println("animal is eating...");}
}

class DogDyna extends Animal{
    void eat(){System.out.println("Dynamic binding here: dog is eating...");}
    public static void main(String args[]){
        Animal a=new DogDyna();
        a.eat();//type of the object is determined at run-time, it is known as dynamic binding
    }
}