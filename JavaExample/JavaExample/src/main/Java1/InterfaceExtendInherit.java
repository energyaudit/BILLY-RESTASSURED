package src.main.Java1;

/**
 * Created by byang on 2/5/2018.
 */
interface Printable3{
    void print();
}
interface Showable3 extends Printable3{//Showable3 inherit Printable3
    void show();//empty method body
}
class TestInterface4 implements Showable{//class implement give interface details
    public void print(){System.out.println("Interface method body is always empty\nClass implement both sub-interface" +
            "&parent interface method:Call Parent Interface method:Hello Parent");}//method1 give detail of interface printable3
    public void show(){System.out.println("Welcome sub interface :call sub interface method");}//method2 give detail of interface showable3

    public static void main(String args[]){
        TestInterface4 obj = new TestInterface4();
        obj.print();
        obj.show();
    }
}
