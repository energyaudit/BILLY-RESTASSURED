package src.main.Java1;

/**
 * Created by byang on 2/2/2018.
 */
class Animal7{}
class Dog5 extends Animal7{//Dog inherits Animal

    public static void main(String args[]){
        Dog5 d=new Dog5();
        System.out.println("true,An object of subclass type is also a type of parent class.,dog is Animal");
        System.out.println(d instanceof Animal7);//true,An object of subclass type is also a type of parent class.
    }//For example, if Dog extends Animal then object of Dog can be referred by either Dog or Animal class
}
