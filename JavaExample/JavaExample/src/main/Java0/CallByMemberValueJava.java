package src.main.Java0;

/**
 * Created by byang on 2/9/2018.
 */
class Operation{
    int data=50;//    There is only call by value in java, not call by reference.
    void change(int data){//If we call a method passing a value, it is known as call by value
        data=data+100;//changes will be in the local variable only
    }

    public static void main(String args[]){
        Operation op=new Operation();

        System.out.println("before change "+op.data);
        op.change(500);
        System.out.println("after change "+op.data);//In case of call by value original value is not changed.

    }
}