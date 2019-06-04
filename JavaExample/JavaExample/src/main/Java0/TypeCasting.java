package src.main.Java0;

/**
 * Created by byang on 1/19/2018.
 */
public class TypeCasting
{
    public static void main(String[] args){
        float f=10.5f;
//int a=f;//Compile time error
        int a=(int)f;// // float value is explicitly type casted to int, see the Java syntgax

        System.out.println("f is float:"+f);
        System.out.println("float value is explicitly type casted to int:"+a);
    }

}
