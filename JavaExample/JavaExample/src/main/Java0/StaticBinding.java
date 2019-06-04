package src.main.Java0;

/**
 * Created by byang on 2/2/2018.
 */

class Dog{
    private void eat(){System.out.println("If there is any private, final or static method in a class, there is static binding.dog is eating...");}//If there is any private, final or static method in a class, there is static binding.

    public static void main(String args[]){
        Dog d1=new Dog();
        d1.eat();//Static binding uses Type(Class in Java) information for binding while Dynamic binding uses Object to resolve binding."
    }//Binding of private, static and final methods always happen at compile time since these methods cannot be overridden. Binding of overridden methods happen at runtime.
//Java uses static binding for overloaded methods and dynamic binding for overridden methods.
}
