package src.main.Java0;

/**
 * Created by byang on 1/26/2018.
 */
class A1{
    void m(){System.out.println("This refers current object.hello m");}
    void n(){
        System.out.println("invoke current class method by same object.hello n");
//m();//same as this.m() because m() is method of class A
        this.m();//this: to invoke current class method by same object,this keyword be used inside Methods to call another Method from same Class.
    }
}
class TestThis4{
    public static void main(String args[]){
        A1 a=new A1();
        a.n();
    }}
