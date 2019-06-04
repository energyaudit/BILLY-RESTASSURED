package src.main.Java0;

/**
 * Created by byang on 1/19/2018.
 */
public class LeftShiftOperator
{
    public static void main(String args[]){
        System.out.print("1<<2=1*2^2=2^2=2^n ");// This cannot be write same line as 10<<2,because string cannot +number
        System.out.println(1<<2);
        System.out.print("1<<3=1*2^3=2^3=2^n ");// This cannot be write same line as 10<<2,because string cannot +number
        System.out.println(1<<3);
        System.out.print("10<<2=10*2^2=10*4=10*2^n ");// This cannot be write same line as 10<<2,because string cannot +number
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.print("10<<3=10*2^3=10*8=10*2^n  ");
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.print("20*2^2=20*4=80=20*2^n  ");
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.print("15*2^4=15*16=240=15*2^n  ");
        System.out.println(15<<4);//15*2^4=15*16=240
    }
}
