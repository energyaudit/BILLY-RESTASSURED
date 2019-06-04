package src.main.Java1;

/**
 * Created by byang on 2/2/2018.
 */
class Animal9 {//parent class
    Animal9()//constructor
    {
        System.out.println("Subclass will call parent/super constructor first,super constructor first");
    }
    // do animal-things
    public void Eat(Animal9 anim) {
        System.out.println("Animal can eat and Run");
    }
}

    class Dog3 extends Animal9 {//child class

        public void bark() {
            System.out.println("Dog is barking");
        }

        static void method(Animal9 a) {//a dog is animal, but animal maybe dog, maybe not. "instance of" will judge if this animal is dog first.
            if (a instanceof Dog3) {//If you perform it by typecasting, ClassCastException is thrown at runtime. But if we use instanceof operator, downcasting is possible
                Dog3 d = (Dog3) a;//downcasting Parent object  to Subclass type
                System.out.println("method only accept animal type as parameter,a dog is animal, but animal maybe dog, maybe not. \"instance of\" will judge if this animal is dog first.\n" +
                        "Animal9 a = new Dog3();Use downcasting when we want to access specific behaviors of a subtype.");
                d.bark();

            }//Upcasting is casting a subtype to a supertype,
        }//Upcasting is always safe, as we treat a type to a more general one,Animal anim = (Animal) dog;

        public static void main(String[] args) {
            Animal9 a = new Dog3();
            Dog3.method(a);//  Animal9 a = new Dog3();Use downcasting when we want to access specific behaviors of a subtype.method only accept animal type as parameter
        }

    }

