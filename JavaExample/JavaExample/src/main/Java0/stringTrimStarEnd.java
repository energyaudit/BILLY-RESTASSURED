package src.main.Java0;

/**
 * Created by byang on 2/9/2018.
 */
public class stringTrimStarEnd {
    public static void main(String args[]){//to run this program,this main line is mandatory
    String s="  Sachin  ";
    System.out.println(s);//  Sachin is the String class object
    System.out.println(s.trim());//Sachin,cut the space front

        String s1="Sachin";
        System.out.println(s1.startsWith("Sa"));//true
        System.out.println(s1.endsWith("n"));//true

        String s2="Sachin";
        System.out.println(s2.charAt(0));//S
        System.out.println(s2.charAt(3));//h

        String s3="Sachin";
        System.out.println(s3.length());//6

        String s5=new String("Sachin");
        String s6=s.intern();//When the intern method is invoked, if the pool already contains a string equal to this String object
        //then the string from the pool is returned.. Otherwise, this String object is added to the pool and a reference to this String object is returned
        System.out.println(s6);//Sachin

        int a=10;
        String s7=String.valueOf(a);//convert int to String in java using String.valueOf() and Integer.toString() methods
        System.out.println(s7+10);

        int i = 11;

		/* To convert int to String, use toString(int i) method of Integer wrapper class.*/
        String str = Integer.toString(i);
        System.out.println("int to String : " + str);

        String s8="S8: Java is a programming language. Java is a platform. Java is an Island.";
        String replaceString=s8.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"
        System.out.println(replaceString);

        String s11="ABCDEFG";
        byte[] barr=s11.getBytes();//getBytes() method returns the byte array of the string. In other words, it returns sequence of bytes
        System.out.println(barr.length);
        for(int k=0;k<barr.length;k++){
            System.out.println("ABCDEFG"+barr[k]);  }


    }}



