package src.main.Java1;

/**
 * Created by byang on 2/2/2018.
 */
class Shape{//Polymorphism in java is a concept by which we can perform a single action by different ways
    void draw(){System.out.println("drawing...");}
}
class Rectangle extends Shape{//We can perform polymorphism in java by method overloading and method overriding
    void draw(){System.out.println("drawing rectangle...");}
}
class CircleRuntime extends Shape{//If you overload static method in java-- compile time polymorphism, it is the example of compile time polymorphism.
    void draw(){System.out.println("drawing circle...");}
}
class Triangle extends Shape{
    void draw(){System.out.println("drawing triangle...");}
}
class TestPolymorphism2{//Here, we will focus on runtime polymorphism in java.
    public static void main(String args[]){
        Shape s;//declare
        s=new Rectangle();
        s.draw();
        s=new CircleRuntime();
        s.draw();
        s=new Triangle();
        s.draw();
    }
}
