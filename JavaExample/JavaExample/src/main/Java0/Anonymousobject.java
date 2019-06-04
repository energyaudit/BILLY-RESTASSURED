/**
 * Created by byang on 1/22/2018.
 */
package src.main.Java0;
class Calculation{//Anonymous simply means nameless. An object which has no reference is known as anonymous object.
    void fact(int  n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial is "+fact);
    }
    public static void main (String args[]){
        new Calculation().fact(5);//calling method with anonymous object,If you have to use an object only once, anonymous object is a good approach.
    }
}
