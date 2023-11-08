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

     



    }
}