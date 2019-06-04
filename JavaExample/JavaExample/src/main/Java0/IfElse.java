package src.main.Java0;

/**
 * Created by byang on 1/19/2018.
 */
public class IfElse
{
    public static void main(String[] args) {
        int number=13;
        if(number%2==0){//modula,If statement
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }

        int i = 10;//If Else-If statement
        if(i > 100)
            System.out.println("i is grater than 100");
        else if(i > 50)
            System.out.println("i is grater than 50");
        else
            System.out.println("i is less than 50");
    }
}
