package src.main.Java1;

/**
 * Created by byang on 2/1/2018.
 */
class A{//The covariant return type specifies that the return type may vary in the same direction as the subclass
    A()//constructor
    {
        System.out.println("Subclass will call parent/super constructor first,super constructor first");
    }
    A get(){return this;}//the return type of the get() method of A class is A
    void message(){System.out.println("parent class A method here: parent message");}
}

class B1 extends A{//since Java5, it is possible to override method by changing the return type if subclass overrides any method whose return type is Non-Primitive
    B1 get(){return this;}//but the return type of the get() method of B class is B,
                           // Both methods have different return type but it is method overriding. This is known as covariant return type.
    void message(){System.out.println("method get return object : changes its return type to subclass type:then method message print\n" +
            "return type specifies that the return type may vary in the same direction as the subclass,welcome to covariant\n sub class method message called:return type");}//extra method than super class A.

    public static void main(String args[]){
        new B1().get().message();//method get return object : changes its return type to subclass type:then method message print
    }
}