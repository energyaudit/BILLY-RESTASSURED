package src.main.Java1;

/**
 * Created by byang on 2/5/2018.
 */
interface Printable1{
    void print();
}
interface Showable1{
    void print2();//method same as interface printable1
}

class TestInterface3 implements Printable1, Showable1{//Multiple inheritance is not supported through class in java but it is possible by interface,
    public void print(){System.out.println("Multiple inheritance is not supported through class in java but it is possible by interface," +
            "Printable Method:Hello1");}//because one class can have multiple functions,
    public void print2(){System.out.println("Multiple inheritance is not supported through class in java but it is possible by interface," +
            "Printable Method:Hello2");}
    public static void main(String args[]){
        TestInterface3 obj = new TestInterface3();//
        obj.print();//
        obj.print2();//
    }
}
