package src.main.Java0;

/**
 * Created by byang on 2/12/2018.
 */
public class StringBuilderMethods {
    public static void main(String args[]){
        StringBuilder sb1=new StringBuilder("Hello ");
        sb1.append("Java");//now original string is changed
        System.out.println(sb1);//prints Hello Java

        StringBuilder sb2=new StringBuilder("Hello ");
        sb2.insert(1,"Java");//now original string is changed, The StringBuilder insert() method inserts the given string with this string at the given position
        System.out.println(sb2);//prints HJavaello

        StringBuilder sb3=new StringBuilder("Hello");
        sb3.replace(1,3,"Java");//The StringBuilder replace() method replaces the given string from the specified beginIndex and endIndex.
        System.out.println(sb3);//prints HJavalo

        StringBuilder sb4=new StringBuilder("Hello");
        sb4.delete(1,3);//The delete() method of StringBuilder class deletes the string from the specified beginIndex to endIndex
        System.out.println(sb4);//prints Hlo

        StringBuilder sb5=new StringBuilder("Hello");
        sb5.reverse();
        System.out.println(sb5);//prints olleH

        StringBuilder sb6=new StringBuilder();
        System.out.println(sb6.capacity());//default 16
        sb6.append("Hello");
        System.out.println(sb6.capacity());//now 16
        sb6.append("java is my favourite language");
        System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2

        StringBuilder sb7=new StringBuilder();
        System.out.println(sb7.capacity());//default 16
        sb7.append("Hello");
        System.out.println(sb7.capacity());//now 16
        sb7.append("java is my favourite language");
        System.out.println(sb7.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb7.ensureCapacity(10);//now no change
        System.out.println(sb7.capacity());//now 34
        sb7.ensureCapacity(50);//now (34*2)+2
        System.out.println(sb7.capacity());//now 70

        System.out.println("Hashcode test of String:");
        String str="java";
        System.out.println(str.hashCode());
        str=str+"tpoint";
        System.out.println(str.hashCode());

        System.out.println("Hashcode test of StringBuffer:");
        StringBuffer sb8=new StringBuffer("java");
        System.out.println(sb8.hashCode());//String returns new hashcode value when you concat string but StringBuffer returns same.
        sb8.append("tpoint");
        System.out.println(sb8.hashCode());

        long startTime = System.currentTimeMillis();
        StringBuffer sb9 = new StringBuffer("Java");
        for (int i=0; i<10000; i++){
            sb9.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb10 = new StringBuilder("Java");
        for (int i=0; i<10000; i++){
            sb10.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");





    }
}

