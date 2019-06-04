package src.main.Java2;

/**
 * Created by byang on 2018-06-01.
 */
class Numbers {
    int a = 10;
    int b = 20;
}

class AddNumbers extends Numbers {
    /* This method is used to add.     */
    public void showAdd(){
        System.out.println("add number,get data memeber from super class,a="+a+",b="+b+",a+b=");
        System.out.println(a + b);
    }
}

class MultiplyNumbers extends Numbers {
    /* This method is used to multiply.     */
    public void showMultiplication(){
        System.out.println("Multiply,get data member from super class,a="+a+",b="+b+",a*b=");
        System.out.println(a * b);
    }
}

 class Test {
    public static void main(String args[]){
        //creating base classes objects
        AddNumbers obj1 = new AddNumbers();
        MultiplyNumbers obj2 = new MultiplyNumbers();
        //method calls
        obj1.showAdd();
        obj2.showMultiplication();
    }
}
