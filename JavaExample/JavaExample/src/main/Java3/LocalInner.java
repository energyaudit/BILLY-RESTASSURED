package src.main.Java3;

/**
 * Created by byang on 3/13/2018.
 */
public class LocalInner {

    private int data=30;//instance variable,because outside method and inside class and not in Main
    void display(){
        class Local{//created inside a method is called local inner class in java.
            void msg(){System.out.println(data);}
        }
        Local l=new Local();//If you want to invoke the methods of local inner class, you must instantiate this class inside the method
        l.msg();
    }
    public static void main(String args[]){
        LocalInner obj=new LocalInner();
        obj.display();
    }
}
