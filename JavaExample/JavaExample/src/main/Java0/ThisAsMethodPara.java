package src.main.Java0;

/**
 * Created by byang on 2018-07-11.
 */


public class ThisAsMethodPara {
    public static void main(String[] args) {
        JBT1 obj = new JBT1();
        obj.i = 10;
        obj.method();

    }
}
class JBT1 extends ThisAsMethodPara {
    int i;
    void method() {
        System.out.println("this is method parameter here,same object reuse in another method::");
        method1(this);//this is method parameter here
    }
    void method1(JBT1 t) {
        System.out.println("Main can be in front of constructor too.this is method parameter here,same object reuse in another method:"+t.i);
    }
}