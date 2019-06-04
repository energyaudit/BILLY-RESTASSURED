package src.main.Java0;

/**
 * Created by byang on 2/9/2018.
 */
public class Testimmutablestring {

    public static void main(String args[]){
        String s="Sachin";
        s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//will print Sachin because strings are immutable objects,Sachin is not changed but a new object is created with sachintendulkarai
    }
}
