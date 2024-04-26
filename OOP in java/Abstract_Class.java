package Inheritance;

abstract class Animal {
    abstract public void name(String a);

    public void legs(int legs) {
    };

    abstract public void gender(char c);
}

class Cat extends Animal {
    String name = "Cat";

    public void name(String a) {
        System.out.println("Animal Name is " + a);
    }

    public void gender(char c) {
        System.out.println(name + " is " + c);
    }
}

class Dog extends Animal {
    String name = "Dog";

    public void name(String a) {
        System.out.println("Animal name is " + a);
    }

    public void gender(char c) {
        System.out.println(name + "is " + c);
    }
}

public class Abstract_Class {
    public static void main(String[] args) {
        // Animal obj=new Animal(); ----> Not Allowed (Animal class ia abstract)

        // Cat obj=new Cat();
        // obj.name("CAT");
        // obj.gender('f');

        // Dog obj1 =new Dog();
        // obj1.name("Dog");
        // obj1.gender('M');

        Animal obj2 = new Cat();
        obj2.name("Cat");
        obj2.gender('M');

    }
}
