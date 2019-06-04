package src.main.Java2;



class Display1{
    public void displayName(){
        System.out.println("jai");
        //call current class method using this
        this.displayRollNo();
    }

    public void displayRollNo(){
        System.out.println("6");
        //compiler will automatically add this keyword if not used.
        displayClass();
    }

    public void displayClass(){
        System.out.println("MCA");
    }
}

public class MethodChaining {
    public static void main(String args[]){
        //create Display class object
        Display1 display = new Display1();

        //method call
        display.displayName();
    }
}
