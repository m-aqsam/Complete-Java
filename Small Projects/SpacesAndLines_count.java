import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Methods {
    Scanner sc = new Scanner(System.in);

    String str;

    // -----------------> Take Input from user
    public void input() {
        System.out.println("Enter your String Here : ");
        str = sc.nextLine();

    }

    // ---------------> to count Number of spaces
    public void findSpaces() {
        int space = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                space++;
            }

        }

        System.out.println("Number of spaces in Given String is " + space);
    }

    // ---------------> count number of characters / alphabets in String

    public void count_Char() {

        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                total++;
            }
        }

        System.out.println("Total Number of Alphabets in String are " + total);
    }

    // ---------------> Find number of spaces and Alphabets in a text File
    // <---------------

    public void spaces_char_in_txt() throws FileNotFoundException { // to handle exception alternate of try/catch

        File file = new File("NewFile.txt");

        Scanner reader = new Scanner(file);

        String str = reader.nextLine();
        int space = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                space++;

            }
        }

        System.out.println("Number of Space in given txt File are " + space);

        // -------------> To Find total number of Characters/Alphabets in a txt file
        // <--------------

        int Totalchar = 0;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch != ' ') {
                Totalchar++;
            }
        }

        System.out.println("Total Alphabets/characters in Given txt file are : " + Totalchar);

    }
}

public class SpacesAndLines_count {
    public static void main(String[] args) throws FileNotFoundException { // Alternate of try catch Exception handle

        Methods obj1 = new Methods();
        // obj1.input();
        // obj1.findSpaces(); // Find spaces in a string
        // obj1.count_Char(); // Find Char/alphabets in a string

        obj1.spaces_char_in_txt(); // find spaces in txt file

    }
}
