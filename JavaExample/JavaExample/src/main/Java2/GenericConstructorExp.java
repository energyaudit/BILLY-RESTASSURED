package src.main.Java2;

/**
 * Created by byang on 2018-09-10.
 */

class GenericConstructorExp<X> {//In Java 7, Java provides improved compiler which is enough smart to infer the type of generic instance.
// Now, you can replace the type arguments with an empty set of type parameters (<>)
    <T>GenericConstructorExp(T t) {
        System.out.println(t);
    }
}
 class TypeInference {
    public static void main(String[] args) {
        GenericConstructorExp<String> gc1 = new GenericConstructorExp<>("Hello");

        GenericConstructorExp<String> gc2 = new GenericConstructorExp<>(2);

        GenericConstructorExp<String> gc3 = new GenericConstructorExp<>(2.6);
    }
}