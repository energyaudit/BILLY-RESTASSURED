package src.main.Java0;

/**
 * Created by byang on 2/8/2018.
 */
class Testarray4{
    public static void main(String args[]){

        int arr[]={4,4,5};

        Class c=arr.getClass();//In java, array is an object.
        String name=c.getName();//For array object, an proxy class is created whose name can be obtained by getClass().getName() method on the object.

        System.out.println(name);

    }}
