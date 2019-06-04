package src.main.Java2;

/**
 * Created by byang on 2018-06-14.
 */
import java.util.ArrayList;
import java.util.List;
@FunctionalInterface
interface HelloWorld {
    String sayHello(String name);
}

@FunctionalInterface
interface AddInterface{
    void add(int a, int b);
}

public class LambdaExpression {
    public static void main(String args[]){
        HelloWorld helloWorld = (String name) -> { return "Hello " + name; };//Lamda expression,one parameter
        System.out.println(helloWorld.sayHello("Jai+\n"));


    AddInterface addInterface=(a, b)->{//Lambda Expression Multiple Parameters
        System.out.println();
        System.out.println(a + b);    };
    addInterface.add(10, 20);

        List<String> list=new ArrayList<String>();//Lambda Expression Foreach Loop
        System.out.println();
        list.add("Jai");
        list.add("Vivek");
        list.add("Mahesh");
        list.add("Vishal");
        list.add("Naren");
        list.add("Hemant");
        list.add("Vikas");
        list.add("Ajay");

        list.forEach(
                (name)->System.out.println(name)
        );
    }




}

