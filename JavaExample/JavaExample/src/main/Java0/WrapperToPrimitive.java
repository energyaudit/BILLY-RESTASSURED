package src.main.Java0;

/**
 * Created by byang on 2/8/2018.
 */
public class WrapperToPrimitive {

    public static void main(String args[]){
//Converting Integer obj to int
        Integer a=new Integer(3);//The automatic conversion of primitive into object is known as autoboxing
        int i=a.intValue();//converting Integer to int
        int j=a;//unboxing, now compiler will write a.intValue() internally

        System.out.println(a+" "+i+" "+j);

        //Converting int primitive into Integer object
        int num=100;
        Integer obj=Integer.valueOf(num);
        System.out.println(num+ " "+ obj);

        Integer obj1 = new Integer(100);

        //Converting the wrapper object to primitive
        int num1 = obj1.intValue();

        System.out.println(num1+ " "+ obj);
    }
}
