//package Inheritance;

class Base {
    Base() {
        System.out.println("I am a constructor of Base ");
    }

    Base(int a) {
        System.out.println("I am a constructor of Base wit a " + a);
    }
}

class Derived1 extends Base {
    Derived1() {
        System.out.println("I am a contructor of Derived1 ");
    }

    Derived1(int a) {
        super(5);
        System.out.println("I am a constructor of derived with a " + a);
    }
}

class Derived2 extends Derived1 {
    Derived2() {
        System.out.println("I am a contructor of Derived2 ");
    }

    Derived2(int a) {
        super(4);
        System.out.println("I am a constructor of Derived2 with a " + a);
    }

}

public class Inheritance_Problem {
    public static void main(String[] args) {

        Derived2 obj = new Derived2(3);

    }
}
