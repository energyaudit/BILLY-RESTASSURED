package src.main.Java3;

/**
 * Created by byang on 3/2/2018.
 */
public class MemberInnerClass {

    private int data=30;
    class Inner{//inner class
        void msg(){System.out.println("data is "+data);}// msg() method in member inner class that is accessing the private data member of outer class:MemberInnerClass.
    }
    public static void main(String args[]){
        MemberInnerClass obj=new MemberInnerClass();
        MemberInnerClass.Inner in=obj.new Inner();//inner class instance
        in.msg();//inner class method
    }
}
