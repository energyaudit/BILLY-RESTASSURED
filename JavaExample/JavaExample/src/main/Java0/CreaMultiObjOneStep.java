package src.main.Java0;

/**
 * Created by byang on 1/22/2018.
 */

public class CreaMultiObjOneStep {//2 classes in 1 java file.One is private and one is public.
    public static void main(String args[]){
        Rectangle r1=new Rectangle(),r2=new Rectangle();//creating two objects in one step
        r1.insert(11,5);
        r2.insert(3,15);
        r1.calculateArea();
        r2.calculateArea();
    }

}
