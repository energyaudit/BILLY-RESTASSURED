package src.main.Java1;

/**
 * Created by byang on 1/31/2018.
 */
class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}//change method parameters number to overwrite.
}
class TestOverloading1{
    public static void main(String[] args){
        System.out.println("Static method 2 parameters:"+Adder.add(11,11));//method same but parameter number different
        System.out.println("Static method 3 parameters:"+Adder.add(11,11,11));//static method so no new need to crate object,just use method directly.
    }}
