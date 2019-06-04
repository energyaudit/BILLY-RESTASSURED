package src.main.Java3;

/**
 * Created by byang on 3/12/2018.
 */
interface Age
{
    int x = 21;
    void getAge();
}
class AnonymousDemo
{
    public static void main(String[] args)
    {
        // Myclass is implementation class of Age interface
        MyClass obj=new MyClass();

        // calling getage() method implemented at Myclass
        obj.getAge();
    }
}

// Myclass implement the methods of Age Interface, this can be placed after main still works
class MyClass implements Age//Myclass IS required to override
{
    @Override
    public void getAge()
    {
        // printing the age
        System.out.print("Age is "+x);
    }
}