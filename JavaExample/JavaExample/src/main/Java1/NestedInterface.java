package src.main.Java1;

/**
 * Created by byang on 3/5/2018.
 */
public interface NestedInterface {
    void show();
    interface Message{//nested interface
        void msg();//no message body
    }
}
class TestNestedInterface1 implements NestedInterface.Message{//implement nested interface
    public void msg(){System.out.println("the class implements Nested Interface.\n" +
            "upcasting here,we are acessing the Message interface by its outer interface Showable because it cannot be accessed directly.\n" +
            "Hello nested interface method implemented by my class");}// implement nested interface method

    public static void main(String args[]){
        NestedInterface.Message message=new TestNestedInterface1();//upcasting here,we are acessing the Message interface by its outer interface Showable because it cannot be accessed directly. It is just like almirah inside the room, we cannot access the almirah directly because we must enter the room first
        message.msg();
    }
}
