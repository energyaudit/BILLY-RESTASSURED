package src.main.Java3;

/**
 * Created by byang on 2/28/2018.
 */
//public class ThrowDeclareExecept {
//}
import java.io.*;
class MThrowExept{
    void method()throws IOException{//you declare the exception, if exception does not occur, the code will be executed fine.
        System.out.println("device operation performed");
    }
}
class Testthrows3 {
    public static void main(String args[]) throws IOException {//declare exception,you declare the exception, if exception does not occur, the code will be executed fine.
        MThrowExept m = new MThrowExept();
        m.method();
        System.out.println("normal flow...");
    }



        }
