package src.main.Java2;

/**
 * Created by byang on 2018-06-08.
 */
class TestBF{
    //static blank final variable which can only be initialize
    //through static initializer block.
    static final int num;

    static{
        num = 100;
        System.out.println("static blank final variable which can only be initialize through static initializer block,static block can also do operation.Num = " + num);
    }
}
public class BlankFinal {
    public static void main(String args[]){
        new TestBF();
    }
}