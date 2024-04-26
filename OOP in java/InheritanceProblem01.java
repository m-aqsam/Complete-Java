package Inheritance;

class Global {
    public static int count = 0;

}

class Base {
    Base() {
        System.out.println("I am a constructor of base ");
        Global.count++;
    }
}

class Derived {
    Derived() {
        System.out.println("I am a constructor of Derived ");
        Global.count++;
    }
}

class Derived2 {
    Derived2() {
        System.out.println("I am a constructor of Derived2 ");
        Global.count++;
    }
}

public class InheritanceProblem01 {
    public static void main(String[] args) {
        Base obj1 = new Base();
        // System.out.println(Global.count);

        Derived obj2 = new Derived();
        // System.out.println(Global.count);

        Derived2 obj3 = new Derived2();
        System.out.println("Number of objects Created = " + Global.count);

    }
}
