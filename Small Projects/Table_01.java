import java.util.*;

class Methods {

  Scanner sc = new Scanner(System.in);

  public void table() {
    System.out.println("Enter the num you want table :");
    int num = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
      int Table = num * i;
      System.out.println(num + "*" + i + "=" + Table);
    }

  }

}

public class Table_01 {
  public static void main(String[] args) {

    Methods obj1 = new Methods();
    obj1.table();

  }
}
