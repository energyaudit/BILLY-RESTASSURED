package src.main.Java3;

/**
 * Created by byang on 2/21/2018.
 */
public class CatchMulti {
    public static void main(String args[]){
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e){System.out.println("task1 is completed");}
        catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
        catch(Exception e){System.out.println("common task completed");}

        System.out.println("rest of the code..."+"\n");


        try{//nested try example below
            try{
                System.out.println("going to divide");
                int b =39/0;
            }catch(ArithmeticException e){System.out.println(e);}

            try{
                int a[]=new int[5];
                a[5]=4;
            }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}

            System.out.println("\n"+"other statement");
        }catch(Exception e){System.out.println("handeled");}//exception not captured by arithmetic and array,so no this kind of exception also no "handeled" print.

        System.out.println("\n"+"normal flow..");
    }
}

