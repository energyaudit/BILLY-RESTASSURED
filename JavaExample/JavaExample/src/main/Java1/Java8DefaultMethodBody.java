package src.main.Java1;

/** Created by byang on 2/5/2018. */
//Since Java 8, we can have method body in interface. But we need to make it default method. Let's see an example:


interface Drawable{
    void draw();//All interface methods are public by default (even if you don't specify it explicitly in the interface definition)
    default void msg(){System.out.println("Since Java 8, we can have  default method body in interface.object can call default method" +
            ":default method");}//Since Java 8, we can have  default method body in interface.
}
class Rectangle2 implements Drawable{
    public void draw(){System.out.println("class Rectangle2 implements Drawable: drawing rectangle");}//
}
class TestInterfaceDefault{
    public static void main(String args[]){
        Drawable d=new Rectangle2();
        d.draw();
        d.msg();
    }}
