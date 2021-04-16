package mgmt;

public class Main {
   public static void main(String[] args) {
      Artist one = new Artist("Milan", "Arif", 25);

      DbHandler.add(one);

      DbHandler.updateStringField(4, "name", "Johansson");

      DbHandler.updateIntField(5, "age", 50);

      DbHandler.findById(3);

      DbHandler.showAll();

   }
}
