import java.util.ArrayList;

class ListPractice {

    public void listMethods() {
        // Array list in java

        ArrayList<String> cars = new ArrayList<>();
        // add an element in Array list using add method

        // 1 : (By default)
        cars.add("Mehran"); // to the 4th index in this array list

        // 2 : (By using index number to add element)

        cars.add(0, "Toyota");
        cars.add(1, "Tesla");
        cars.add(2, "BMW");
        cars.add(3, "Suzuki");

        // Get/Print an element using get method
        // 1:

        String b = cars.get(0);
        System.out.println(cars.get(0));

        // 2:

        System.out.println(cars.get(4));

        // to find the size od an array list use size method

        System.out.println(cars.size());

        // clear an array list using clear method
        cars.clear();
        System.out.println(cars.get(0));

    }
}

public class Lists {
    public static void main(String[] args) {
        ListPractice obj1 = new ListPractice();
        obj1.listMethods();

    }
}
