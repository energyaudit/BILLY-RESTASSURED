package src.main.Java0;

/**
 * Created by byang on 2/9/2018.
 */
public class StringBufferMethod {//Java StringBuffer class is used to create mutable (modifiable) string
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("Java");//now original string is changed,The append() method concatenates the given argument with this string
        System.out.println(sb);//prints Hello Java

        StringBuffer sb1=new StringBuffer("Hello ");//A string that can be modified or changed is known as mutable string.
        sb1.insert(1,"Java");//now original string is changed
        System.out.println(sb1);//prints HJavaello

        StringBuffer sb3=new StringBuffer("Hello");//StringBuffer and StringBuilder classes are used for creating mutable string.
        sb3.replace(1,3,"Java");//The replace() method replaces the given string from the specified beginIndex and endIndex.
        System.out.println(sb3);//prints HJavalo

        StringBuffer sb5=new StringBuffer("Hello");
        sb5.delete(1,3);//The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.
        System.out.println(sb5);//prints Hlo

        StringBuffer sb6=new StringBuffer("Hello");
        sb6.reverse();//The reverse() method of StringBuilder class reverses the current string.
        System.out.println(sb6);//prints olleH

        StringBuffer sb7=new StringBuffer();
        System.out.println(sb7.capacity());//default 16
        sb7.append("Hello");
        System.out.println(sb7.capacity());//now 16
        sb7.append("java is my favourite language");
        System.out.println(sb7.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2

        StringBuffer sb8=new StringBuffer();
        System.out.println(sb.capacity());//default 16
        sb8.append("Hello");
        System.out.println(sb8.capacity());//now 16
        sb8.append("java is my favourite language");
        System.out.println(sb8.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb8.ensureCapacity(10);//now no change
        System.out.println(sb8.capacity());//now 34
        sb8.ensureCapacity(50);//now (34*2)+2
        System.out.println(sb8.capacity());//now 70
    }
}





