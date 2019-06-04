package src.main.Java0;

/**
 * Created by byang on 1/29/2018.
 */
class S2{
    void m(S2 obj){//method m parameter is object and its type is S2
        System.out.println("method m parameter is object and its type is S2,reuse one object in many methods,method is invoked");
    }
    void p(){//The this keyword can also be passed as an argument in the method. It is mainly used in the event handling.
        m(this);//It is used to reuse one object in many methods.
    }
    public static void main(String args[]){
        S2 s1 = new S2();
        s1.p();//s1 call p then p call m
    }
}
