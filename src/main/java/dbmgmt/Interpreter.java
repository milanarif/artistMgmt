package dbmgmt;
import menusys.Input;
import ui.StandardMenus;
import ui.Tables;

import java.time.LocalDate;

public class Interpreter {
   public static void createNewArtist() {
      System.out.println("\n\nAdd Employee");

      System.out.print("First Name: ");
      String name = Input.stringInput();

      System.out.print("Last name: ");
      String lastName = Input.stringInput();

      System.out.print("Age: ");
      int age = Input.intInput();

      DbHandler.add(new Artist(name, lastName, age));
   }

   public static void updateArtist() {
      System.out.println("\n\nUpdate Artist");

      DbHandler.showAll();
      System.out.print("Select artist by ID: ");
      int idOfTarget = Input.intInput();

      StandardMenus.updateMenu();
      int menuOption = Input.intInput();

      switch (menuOption){
         case 1:
            System.out.print("New Name: ");
            String name = Input.stringInput();
            DbHandler.updateField(idOfTarget, "name", name);
            break;
         case 2:
            System.out.print("New Last Name: ");
            String lastName = Input.stringInput();
            DbHandler.updateField(idOfTarget, "name", lastName);
            break;
         case 3:
            System.out.print("New Age: ");
            int age = Input.intInput();
            DbHandler.updateField(idOfTarget, "name", age);
            break;
         case 9:
            break;
      }
   }
   public static void deleteArtist() {
      System.out.println("\n\nDelete Artist");
      DbHandler.showAll();
      System.out.print("Select artist by ID: ");
      int idOfTarget = Input.intInput();

      DbHandler.delete(idOfTarget);
   }


   public static void findById() {
      System.out.println("\n\nFind Artist by ID");
      System.out.print("Enter ID to search for: ");
      int idOfTarget = Input.intInput();
      DbHandler.findById(idOfTarget);
   }
}
