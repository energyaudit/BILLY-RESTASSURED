package src.main.Java0;

/**
 * Created by byang on 1/29/2018.
 */
class A5{
    void m(){
        System.out.println("this is same as object,prints same reference ID: "+this);//this is same as object,prints same reference ID
    }
    public static void main(String args[]){
        A5 obj=new A5();
        System.out.println("print obj :prints the reference ID: "+obj);//obj :prints the reference ID
        obj.m();
    }
}
