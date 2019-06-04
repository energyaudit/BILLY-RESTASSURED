package src.main.Java3;

/**
 * Created by byang on 3/6/2018.
 */
class A{
    interface Message{//Let's see how can we define an interface inside the class and how can we access it.

        void msg();//Since nested interface cannot be accessed directly, the main purpose of using them is to resolve the namespace by grouping related interfaces (or related interface and class) together.
        // This way, we can only call the nested interface by using outer class or outer interface name followed by dot( . ), followed by the interface name.
    }
}

class TestNestedInterface2 implements A.Message{
    public void msg(){System.out.println("Hello nested interface");}

    public static void main(String args[]){
        A.Message message=new TestNestedInterface2();//upcasting here
        message.msg();//interface method
    }
}
