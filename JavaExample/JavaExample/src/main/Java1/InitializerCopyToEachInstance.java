package src.main.Java1;

/**
 * Created by byang on 2/2/2018.
 */
public class InitializerCopyToEachInstance {

    int speed=20;

    InitializerCopyToEachInstance(){System.out.println("constructor is invoked");}//constructor

    {System.out.println("instance initializer block invoked,speed is:"+speed);}//it seems that instance initializer block is firstly invoked but NO.Constructor first.
                                                               //Instance intializer block is invoked at the time of object creation
    public static void main(String args[]){
        InitializerCopyToEachInstance b1=new InitializerCopyToEachInstance();
        InitializerCopyToEachInstance b2=new InitializerCopyToEachInstance();
    }
}
