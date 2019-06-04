package src.main.Java3;

/**
 * Created by byang on 2/20/2018.
 */
public class ArithmeticExceptionE {
    public static void main(String args[]){
        try{
            int data=50/0;
        }catch(ArithmeticException e){System.out.println(e);}
        System.out.println("rest of the code...");
    }
}
