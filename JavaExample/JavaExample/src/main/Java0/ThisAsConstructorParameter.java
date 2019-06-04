package src.main.Java0;

/**
 * Created by byang on 1/29/2018.
 */
class B{//In event handling (or) in a situation where we have to provide reference of a class to another one
    A4 obj;//declare obj type A4
    B(A4 obj){//constructor parameter is obj,type A4
        this.obj=obj;
    }
    void display(){
        System.out.println("declare obj type A4,main create a new A4,pass the this keyword in the constructor of classB,"+obj.data);//using data member of A4 class
    }
}

class A4{
    int data=10;
    A4(){//constructor
        B b=new B(this);// pass the this keyword in the constructor,this is constructor parameter here. It is useful if we have to use one object in multiple classes
        b.display();
    }
    public static void main(String args[]){
        A4 a=new A4();
    }
}
