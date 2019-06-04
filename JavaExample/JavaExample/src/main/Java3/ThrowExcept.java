package src.main.Java3;

/**
 * Created by byang on 2/28/2018.
 */
public class ThrowExcept {

    static void validate(int age){
        if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String args[]){
        validate(13);
        System.out.println("rest of the code...");
    }
}
