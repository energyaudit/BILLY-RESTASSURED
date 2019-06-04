package src.main.Java3;

/**
 * Created by byang on 2/28/2018.
 */
import java.io.IOException;
class M{
    void method()throws IOException{//Case1:You caught the exception i.e. handle the exception using try/catch.
        throw new IOException("device error");
    }
}
public class CatchDeclareExcept{//name must exact same as filename: CatchDeclareExcept or not it cannot be public, and got error Error:(12, 8) java: class CatchDeclareExcep is public, should be declared in a file named CatchDeclareExcep.java
    public static void main(String args[]){//this class name has same name as file name, because there are 2 classes in this java file.So the file has .java to differentiate
        try{
            M m=new M();
            m.method();//throw exception
        }catch(Exception e){System.out.println("exception handled");}//Case1: You handle the exception,if i not handled program quit not to next line at all

        System.out.println("normal flow...");//In case you handle the exception, the code will be executed fine whether exception occurs during the program or not.
    }
}
