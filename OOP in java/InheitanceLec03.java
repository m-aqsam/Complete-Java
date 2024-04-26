package Inheritance;

import java.util.*;

class Phone {
    public void showtime() {
        System.out.println("Time is 8am ");
    }

    public void on() {
        System.out.println("Turning on phone ....");
    }
}

class SmartPhone extends Phone {
    @Override
    public void on() {
        System.out.println("Turning on smartphone .....");

    }

    public void music() {
        System.out.println("Playing music....");
    }

}

public class InheitanceLec03 {
    public static void main(String[] args) {
        SmartPhone obj = new SmartPhone();
        obj.on();

        // Phone obj1 =new Phone();
        // obj1.on();

        // SmartPhone obj=new Phone(); ----> Not Allowed --> (Reference must be of
        // Derived class)

        Phone obj1 = new SmartPhone(); // Allowed
        // obj.showtime(); ---> Allowed
        obj1.on(); // ---> SmartPhone on run due to method override
        // obj.music(); // Not Allowed

    }
}
