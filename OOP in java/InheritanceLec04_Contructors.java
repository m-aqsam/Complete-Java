package Inheritance;

import java.util.*;

class Base {
    Base() {
        System.out.println("I am a contrucror of Base");
    }

    Base(int a) {
        System.out.println("I am a contructor with a " + a);
    }

    Base(int a, int b) {
        System.out.println("I am a contructor of ");

    }
}

class Derived extends Base {
    Derived() {
        System.out.println("I am a contructor of Derived");
    }

    Derived(int a) {
        super(4);
        System.out.println("I ama contructor of derived with a " + a);
    }

}

public class InheritanceLec04_Contructors {
    public static void main(String[] args) {
        // Base obj = new Base(4);

        Derived obj = new Derived(5);

        // Base obj=new Derived(5); same Result as Above

    }
}
