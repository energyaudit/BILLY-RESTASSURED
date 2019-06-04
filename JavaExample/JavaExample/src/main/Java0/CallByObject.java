package src.main.Java0;

/**
 * Created by byang on 3/8/2018.
 */
public class CallByObject {//In case ofIf we pass object ,it seems "call by reference" ,original value is changed
    int data=50;

    void change(CallByObject op){//In this example we are passing object itself(reference-physical address) as a value.
        op.data=op.data+100;//changes will be in the instance variable
    }


    public static void main(String args[]){
        CallByObject op=new CallByObject();

        System.out.println("before change "+op.data);
        op.change(op);//passing object
        System.out.println("after change "+op.data);

    }
}
