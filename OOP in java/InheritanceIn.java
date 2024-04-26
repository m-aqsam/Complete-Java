//package Inheritance;

import java.util.*;

class Base {
    public Base() {
        System.out.println("I am a contructor of Base ");
    }

    public Base(int a) {
        System.out.println("I am a contructor with a for " + a);
    }
}

class Derived extends Base {
    public Derived() {
        super(4);
        System.out.println("I am a contructor of Derived ");
    }

}

public class InheritanceIn {
    public static void main(String[] args) {
        // Base b=new Base();
        Derived d = new Derived();

    }
}
