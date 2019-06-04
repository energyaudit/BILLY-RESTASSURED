package src.main.Java1;

/**
 * Created by byang on 1/30/2018.
 */
class AnimalM{
    void eat(){System.out.println("Call Grandparent Method:eating...\n");}
}
class DogMutliIn extends AnimalM{
    void bark(){System.out.println("Call Parent Method:barking...\n");}
}
class BabyDog extends DogMutliIn{
    void weep(){System.out.println("Call myself Method:weeping...\n");}
}
class TestInheritance2{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.weep();//Call Own Method
        d.bark();//Call Parent Method
        d.eat();//Call Grandparent Method
    }}
