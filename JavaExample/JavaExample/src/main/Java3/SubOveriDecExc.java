package src.main.Java3;
/**
 * Created by byang on 3/2/2018.
 */

    class Parent{
        void msg()throws Exception{System.out.println("parent");}
    }

    class TestExceptionChild3 extends Parent{
        void msg()throws Exception{System.out.println("child");}

        public static void main(String args[]){//Example in case subclass overridden method declares same exception
            Parent p=new TestExceptionChild3();//child instance
            try{
                p.msg();
            }catch(Exception e){}
        }
    }

