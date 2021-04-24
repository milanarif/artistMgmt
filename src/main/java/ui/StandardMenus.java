package ui;

/**
 * The main purpose of this class is to alleviate other classes of long print methods.
 */
public class StandardMenus {
   public static void startMenu(){
      System.out.println("\n MANAGEMENT MENU:");
      System.out.println("1. Add Artist");
      System.out.println("2. Update Artist");
      System.out.println("3. Delete Artist");
      System.out.println("4. Show Artists");
      System.out.println("5. Find Artist By ID");
      System.out.println("9. Exit");
      System.out.print("Select: ");
   }

   public static void updateMenu() {
      System.out.println("1. Name");
      System.out.println("2. Last Name");
      System.out.println("3. Age");
      System.out.println("9. Go Back");
      System.out.print("Select: ");
   }
}
