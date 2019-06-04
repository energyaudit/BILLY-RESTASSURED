package src.main.Java1;

/**
 * Created by byang on 1/31/2018.
 */
class AdderArguType{
    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}//change method parameter type from int to double to overload
}
class TestOverloading2{
    public static void main(String[] args){

        System.out.println("method argu double:"+AdderArguType.add(12.3,12.6));//method same but parameter type different
        System.out.println("method argu int:"+AdderArguType.add(11,11));//static method so no new need to crate object,just use method directly.
        }}
