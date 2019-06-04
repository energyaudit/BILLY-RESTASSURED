package src.main.Java2;

/**
 * Created by byang on 2018-06-04.
 */

/** This program is used to show that an interface* can extends multiple interfaces. */
interface ShowAge{
    //This method is used to print age.
    void age(int age);
}

interface ShowName{
    //This method is used to print name.
    void name(String name);
}

interface showDetails extends ShowAge, ShowName{
    //This method is used to print roll no.
    void rollNo(int rollNo);
}

public class InterfaceExtend implements showDetails{
    /** This method is used to print age. @author CodesJava  */
    @Override
    public void age(int age) {
        System.out.println("Age = " + age);
    }

    /* * This method is used to print name. */
    @Override
    public void name(String name) {
        System.out.println("Name = " + name);
    }

    /** This method is used to print rollNo. */
    @Override
    public void rollNo(int rollNo) {
        System.out.println("RollNo = " + rollNo);
    }

    public static void main(String args[]){
        //object creation
        InterfaceExtend obj = new InterfaceExtend();

        //method call
        obj.name("jai");
        obj.age(26);
        obj.rollNo(4);
    }
}