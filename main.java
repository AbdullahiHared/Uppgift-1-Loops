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


    }
}