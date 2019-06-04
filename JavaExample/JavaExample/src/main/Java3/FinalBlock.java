package src.main.Java3;

/**
 * Created by byang on 2/27/2018.
 */
public class FinalBlock {
    public static void main(String args[]){
        try{//sample1
            int data=25/5;
            System.out.println(data);
        }
        catch(NullPointerException e){System.out.println(e);}
        finally{System.out.println("finally block is always executed1");}//java finally example where exception doesn't occur.
        System.out.println("rest of the code...1"+"\n");


        try{//sample2
            int data=25/0;
            System.out.println(data);
        }
        catch(NullPointerException e){System.out.println(e);}
        finally{System.out.println( "\n"+"finally block is always executed2");}//java finally example where exception occurs and not handled
        System.out.println("rest of the code...");



    }



}




