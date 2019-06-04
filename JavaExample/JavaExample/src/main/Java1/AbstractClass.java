package src.main.Java1;

/**
 * Created by byang on 2/5/2018.
 */
abstract class Shape1{
    abstract void draw();

}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle1 extends Shape1{//A factory method is the method that returns the instance of the class.
    void draw(){System.out.println("extended abstract class method:drawing rectangle");}
}
class Circle1 extends Shape1{
    void draw(){System.out.println("extended abstract class method: drawing circle");}
}
//In real scenario, method is called by programmer or user
class TestAbstraction1{
    public static void main(String args[]){
        Shape1 s=new Circle1();//In real scenario, object is provided through method e.g. getShape() method
        s.draw();
        Rectangle1 r1=new Rectangle1();
        r1.draw();
    }
}