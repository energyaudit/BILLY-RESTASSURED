package src.main.Java3;
/**
 * Created by byang on 3/2/2018.
 */
class Parent2{
    void msg()throws Exception{System.out.println("parent2");}// // throw is used to create a new exception and throw it.
}

class TestExceptionChild4 extends Parent2{
    void msg()throws ArithmeticException{System.out.println("child");}

    public static void main(String args[]){
        Parent2 p=new TestExceptionChild4();//Example in case subclass overridden method declares exception in different name
        try{
            p.msg();
        }catch(Exception e){}



        Parent3 p1=new TestExceptionChild5();//Example in case subclass overridden method declares no exception

        try{
            p1.msg();
        }catch(Exception e){}
    }
}
class Parent3{
    void msg()throws Exception{System.out.println("parent3");}
}

class TestExceptionChild5 extends Parent3{
    void msg(){System.out.println("child override method no exception");}

   }