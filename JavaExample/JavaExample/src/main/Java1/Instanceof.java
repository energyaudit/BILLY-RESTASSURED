package src.main.Java1;

/**
 * Created by byang on 2/2/2018.
 */
class Simple1{
    public static void main(String args[]){
        Simple1 s=new Simple1();
        System.out.println(s instanceof Simple1);//true

        class Animal1{}//constructor
                {
            System.out.println("Subclass will call parent/super constructor first,super constructor first"+"\nis dog animal?");
        }
        class Dog1 extends Animal1{}//Dog inherits Animal
        Dog1 d=new Dog1();
        System.out.println(d instanceof Animal1);//true,dog is always animal

    }
}

