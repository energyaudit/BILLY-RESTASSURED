package src.main.Java2;

/**
 * Created by byang on 2018-06-04.
 */

class Show{
    public final void show(){
        System.out.println("FinalMethod can be Inherit then call: Hello world.");
    }
}

class Display extends Show{
    public void display(){
        System.out.println("sub class method:Hello codesjava.com.");
    }
}

public class InheritFinalMethod {
    public static void main(String args[]){
        //creating object of Display class
        Display obj = new Display();
        //method call
        obj.show();
        obj.display();
    }
}