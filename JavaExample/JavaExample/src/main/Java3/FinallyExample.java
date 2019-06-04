package src.main.Java3;

/**
 * Created by byang on 3/1/2018.
 */
public class FinallyExample{//if the class is not public, this class will show in lower level class of this file name
    public static void main(String[] args){
        try{
            int x=300;
        }catch(Exception e){System.out.println(e);}
        finally{System.out.println("finally block is executed");}//Finally is used to place important code, it will be executed whether exception is handled or not.
    }}

