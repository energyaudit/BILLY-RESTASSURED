package src.main.Java0;

/**
 * Created by byang on 1/22/2018.
 */
class InitiaInstanceByConstructor{
    int id;//class member,because outside any method
    String name;//class member

    InitiaInstanceByConstructor(int i,String n){//this method is same name as class name.So when use new, constructor method call automatically
        id = i;
        name = n;
    }
    void display(){System.out.println(id+" "+name);}//this method is different name from class name, so it is normal method and can be called by class instance

    public static void main(String args[]){
        InitiaInstanceByConstructor s1 = new InitiaInstanceByConstructor(111,"Karan");// parameterized constructor
        InitiaInstanceByConstructor s2 = new InitiaInstanceByConstructor(222,"Aryan");
        s1.display();
        s2.display();
    }
}

