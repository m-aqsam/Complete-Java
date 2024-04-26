//package Inheritance; 

interface AllMethodes {

    int sum(int a, int b);

    void print();

}

interface NewMethodes {
    void meth3();

    void meth4();
}

class Phone {
    void greet() {
        System.out.println("Good Morning !!");
    }

    void music() {
        System.out.println("Music...");
    }
}

class Smartphone extends Phone implements NewMethodes {
    public void meth3() {
        System.out.println("I am meth3");
    }

    public void meth4() {
        System.out.println("I am meth4 ");
    }

}

public class InterfacesIn {
    public static void main(String[] args) {
        Smartphone obj1 = new SmartPhone();
        obj1.greet();
        // obj1.meth3();
        // obj1.greet();

    }

}
