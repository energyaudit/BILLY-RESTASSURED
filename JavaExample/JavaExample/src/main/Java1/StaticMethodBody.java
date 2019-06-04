package src.main.Java1;

/**
 * Created by byang on 2/5/2018.
 */
interface DrawableStatic{
    void draw();//abstract method
    static int cube(int x){return x*x*x;}//Since Java 8, we can have static method in interface.
}
class RectangleStatic implements DrawableStatic{
    public void draw(){System.out.println("casting class type to interface implemented,drawing rectangle:" +
            "One reason is that you want to ensure that no methods that aren't part of the contract are called on the object.");}//give details of interface method
}

class TestInterfaceStatic{
    public static void main(String args[]){
        DrawableStatic d=new RectangleStatic();
      //  RectangleStatic d=new RectangleStatic();
        d.draw();
        System.out.println(DrawableStatic.cube(3));//interface method
    }}
