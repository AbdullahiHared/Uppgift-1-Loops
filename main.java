import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
      // a 
      int tal = 0;

      while (tal < 5) {
       tal++;
       System.out.println(tal);
      }

      sc.nextLine();

      // b

      int tal2 = 5;

      for (int i = 2; i <= tal2; i++) {
        System.out.println(i);
      }

      sc.nextLine();

      // c

      for (int i = 0; i <= 5; i++) {
        System.out.println(i);
      }

      sc.nextLine();

      // d
      int tal3 = 1;
      do {
        tal3++;
        System.out.println(tal3);
      } while (tal3 < 5);

      sc.nextLine();

      // e 

      int tal4 = 6;

      while ( tal4 > 0) {
        tal4--;
        System.out.println(tal4);
      }
      sc.nextLine();

     
      for (int i = 0; i <= 5; i++) {
        System.out.println(i);
        
      }
      sc.nextLine();

      System.out.println("Array");
      int userNumber[] = new int[6];


      System.out.println("reverse Array");
      for (int i = userNumber.length -1; i > 0; i--) {  
          userNumber[i] = sc.nextInt();
          System.out.print(userNumber[i] + " ");  
      } 

      System.out.println(Arrays.toString(userNumber));
      
      

      // Stars game

      String stars = "*";

      System.out.println("How many rows?");
      int starRows = sc.nextInt();

      System.out.println("How many columns?");
      int starColumns = sc.nextInt();

      for (int i = 1; i <= starRows; i++) {
        for (int j = 1; j <= starColumns; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    }

}