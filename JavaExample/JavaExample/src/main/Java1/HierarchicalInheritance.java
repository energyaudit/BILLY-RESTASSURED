package src.main.Java1;

/**
 * Created by byang on 1/30/2018.
 */
class Animalsuper{//hierarchical:both dogsuper and cat inherit from aninalsuper
    void eat(){System.out.println("parent method: eating...");}
}
class Dogsuper extends Animalsuper{
    void bark(){System.out.println("barking...");}
}
class Cat extends Animalsuper{
    void meow(){System.out.println("subclass cat method:meowing...");}
}
class TestInheritance3{
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
        c.eat();
//c.bark();//C.T.Error --Compile Time Error,because c is cat not dog,it cannot use dog method.
    }
}