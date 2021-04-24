package menusys;

import java.util.Scanner;

public class Input {
   public static int intInput(){
      Scanner sc = new Scanner(System.in);
      int inputInt;
      while (true) {
         String input = sc.next();
         try {
            inputInt = Integer.parseInt(input);
            break;
         } catch (NumberFormatException ne) {
            System.out.print("\nInput is not valid, try again: ");
         }
      }
      return inputInt;
   }

   public static String stringInput(){
      Scanner sc = new Scanner(System.in);
      return sc.nextLine();
   }
}
