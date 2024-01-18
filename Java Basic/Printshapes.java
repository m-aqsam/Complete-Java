public class Printshapes {
  public static void main(String[] args) {

    // ---------------Printing Shapes ---------------
    /*
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * 
     */

    for (int i = 1; i <= 5; i++) {

      for (int j = 1; j <= 5; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    System.out.println("----------------------------------------------------------------------------------------------------------------");

    /*
     * 
     * 
     * *
     * * *
     * * * *
     * * * * *
     * 
     */

    for (int i = 1; i <= 5; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    System.out.println("------------------------------------------------------------------------------------------------------------------");

    /*
      
     * * * * *
     * * * *
     * * *
     * *
     * 
     * 
      
     */

    for (int i = 1; i <= 5; i++) {

      for (int j = 5; j >= i; j--) {
        System.out.print("*");

      }
      System.out.println("");
    }

    System.out.println("-------------------------------------------------------------------------------------------------------------------");

    /*
       1
       1 2
       1 2 3
       1 2 3 4
       1 2 3 4 5 
       
     */
    
    for (int i=1;i<=5;i++) {
      
      for (int j=1;j<=i;j++) {
        System.out.print(j);  
        
      }
      System.out.println(""); 
    }

    System.out.println("-------------------------------------------------------------------------------------------------------------------");

    
          System.out.println("    j     a    v    v    a     ");
         System.out.println("    j    a a    v   v   a a    ");
         System.out.println("j    j  aaaaa    v v   aaaaa   "); 
         System.out.println("  jj    a    a    v    a    a  "); 

         System.out.println("---------------------------------------------------------------------------------------------------------------");

        System.out.println("* * * * * * ========================");
        System.out.println(" * * * * *  ========================");
        System.out.println("* * * * * * ========================");
        System.out.println(" * * * * *  ========================");
        System.out.println("* * * * * * ========================");
        System.out.println(" * * * * *  ========================");
        System.out.println("* * * * * * ========================");
        System.out.println(" * * * * *  ========================");
        System.out.println("* * * * * * ========================");
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("===================================="); 

        System.out.println("------------------------------------------------------------------------------------------------------------------");  


        System.out.println(" +\"\"\"\"\"\"+"); 
        System.out.println("[| 0  0 |]"); 
        System.out.println(" |  ^   |"); 
        System.out.println(" | '-'  |"); 
        System.out.println(" +------+");  

  }

}
