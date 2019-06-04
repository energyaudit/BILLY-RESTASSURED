package src.main.Java1;

/**
 * Created by byang on 2/2/2018.
 */
class A5{//The instance initializer block is created when instance of the class is created.
    static int staticVariable;
    int nonStaticVariable;

    // Static initialization block:
    // Runs once (when the class is initialized)
    static {
        System.out.println("The instance initializer block is created when instance of the class is created.\n" +
                "Static initalization.run only once even create 2 object.staticVariable =");//run only once even create 2 object

        staticVariable = 5;
        System.out.println(staticVariable);
        System.out.println();
    }

    A5(){//parent class constructor

        System.out.println("The NON-STATIC instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call)\nparent class constructor invoked");//super constructor
    }
}
class B2 extends A5{//child class
    B2(){//sub class constructor
        super();//The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
        System.out.println("child class constructor invoked After child class initializer  ");//The instance initializer block comes in the order in which they appear.
        System.out.println();
    }
//// Instance initialization block:
// Runs each time you instantiate an object
    {System.out.println("NON-STATIC instance initializer block is invoked");}//The instance initializer block comes in the order in which they appear.

    public static void main(String args[]){
        B2 b=new B2();//Program of instance initializer block that is invoked after super()
        B2 b1=new B2();
    }
}
