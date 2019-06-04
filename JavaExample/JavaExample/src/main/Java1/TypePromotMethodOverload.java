package src.main.Java1;

/**
 * Created by byang on 2/1/2018.
 */
class OverloadingCalculation1{//One type is promoted to another implicitly if no matching datatype is found
    void sum(int a,long b){System.out.println(a+b);}//The short datatype can be promoted to int,long,float or double.
    void sum(int a,int b,int c){System.out.println(a+b+c);}//The char datatype can be promoted to int,long,float or double and so on.


    public static void main(String args[]){
        OverloadingCalculation1 obj=new OverloadingCalculation1();
        obj.sum(20,20);//now second int literal will be promoted to long
        obj.sum(20,20,20);

// short is 16 bit signed type ranges from –32,768 to 32,767.
        short s1 = 50;
        short s2 = 42;

        System.out.println("Value of short variable b1 is :" + s1);
        System.out.println("Value of short variable b1 is :" + s2);
    }
}