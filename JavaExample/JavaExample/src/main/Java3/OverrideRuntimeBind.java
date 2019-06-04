package src.main.Java3;

/**
 * Created by byang on 4/12/2018.
 */
class A3 {
    String name() { return "A"; }
}
class B extends A3 {
    String name() { return "B"; }
}
class C extends A3 {
    String name() { return "C"; }
}
class Override1 {
    public static void main(String[] args) {
        A3[] tests = new A3[] { new A3(), new B(), new C() };
        for (int i = 0; i < tests.length; i++)
            System.out.print(tests[i].name());
    }//As you would     expect, this program prints out “ABC” even though the compile-time type of the instance is A
   //in each iteration of the loop.
}

