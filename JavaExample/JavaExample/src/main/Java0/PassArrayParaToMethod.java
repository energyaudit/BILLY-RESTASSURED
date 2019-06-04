package src.main.Java0;

/**
 * Created by byang on 2/8/2018.
 */
class Testarray2{
    static void min(int arr[]){//arr[] is parameter of method min
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
            if(min>arr[i])
                min=arr[i];

        System.out.println(min);
    }

    public static void main(String args[]){

        int a[]={33,3,4,5};
        min(a);//passing array to method by just array name a, no [] needed.

    }}
