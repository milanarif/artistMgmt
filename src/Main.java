import dbmgmt.DbHandler;
import dbmgmt.Interpreter;
import menusys.Input;
import ui.StandardMenus;

public class Main {
   public static void main(String[] args) {
      //Main menu for program. Exited through case 9.
      boolean alive = true;
      while (alive) {
         StandardMenus.startMenu();
         switch (Input.intInput()) {
            case 1:
               Interpreter.createNewArtist();
               break;
            case 2:
               Interpreter.updateArtist();
               break;
            case 3:
               Interpreter.deleteArtist();
               break;
            case 4:
               DbHandler.showAll();
               break;
            case 5:
               Interpreter.findById();
               break;
            case 9:
               alive = false;
               break;
            default:
               System.out.println("\nNo such option, try again.");
         }
      }

   }
}
