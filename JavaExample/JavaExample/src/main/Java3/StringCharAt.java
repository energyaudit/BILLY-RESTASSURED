package src.main.Java3;

/**
 * Created by byang on 2/19/2018.
 */
public class StringCharAt {
    public static void main(String args[]){
        String str = new String("hello javatpoint how r u");
        char[] ch = new char[10];
        try{
            str.getChars(6, 16, ch, 0);//public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)
            System.out.println(ch);
        }catch(Exception ex){System.out.println(ex);}





        String sindex1="this is index of example";
//passing substring
        int index1=sindex1.indexOf("is");//returns the index of is substring
        int index2=sindex1.indexOf("index");//returns the index of index substring
        System.out.println(index1+"  "+index2);//2 8

//passing substring with from index
        int index3=sindex1.indexOf("is",4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

//passing char value
        int index4=sindex1.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3

        String sintern1=new String("hello");
        String sintern2="hello";
        System.out.println(sintern1);
        System.out.println(sintern2);
        String sintern3=sintern1.intern();//returns string from pool, now it will be same as s2
        System.out.println(sintern1==sintern2);//false because reference is different
        System.out.println(sintern2==sintern3);//true because reference is same
    }
    }




