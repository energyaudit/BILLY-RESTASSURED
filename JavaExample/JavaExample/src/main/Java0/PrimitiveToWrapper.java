package src.main.Java0;

/**
 * Created by byang on 2/8/2018.
 */
public class PrimitiveToWrapper {//Wrapper class in java provides the mechanism to convert primitive into object and object into primitive.

    public static void main(String args[]){
//Converting int into Integer
        int a=20;
        Integer i=Integer.valueOf(a);//converting int into Integer,i is object,Primitive to Wrapper-object
        Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally,automatic conversion of primitive into object is known as autoboxing

        System.out.println(a+" "+i+" "+j);

        Integer a1=new Integer(3);
        int i1=a1.intValue();//converting Integer to int,object to primitive
        int j1=a1;//unboxing, now compiler will write a.intValue() internally
        System.out.println(a1+" "+i1+" "+j1);

        Byte bObj = new Byte("100");
        //use toString method of Byte class to convert Byte into String.
        String str = bObj.toString();
        System.out.println("Byte converted to String as " + str);

        //Convert Byte to numeric primitive data types
        Byte bObj1 = new Byte("10");
        //use byteValue method of Byte class to convert it into byte type.
        byte b = bObj1.byteValue();
        System.out.println(b);

        //use shortValue method of Byte class to convert it into short type.
        short s = bObj.shortValue();
        System.out.println(s);

        //use intValue method of Byte class to convert it into int type.
        int ii = bObj.intValue();
        System.out.println(ii);

        //use floatValue method of Byte class to convert it into float type.
        float f = bObj.floatValue();
        System.out.println(f);

        //use doubleValue method of Byte class to convert it into double type.
        double d = bObj.doubleValue();
        System.out.println(d);

        //use longValue method of Byte class to convert it into long type.
        long l = bObj.longValue();
        System.out.println(l);

    }
}
