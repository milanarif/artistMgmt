package mgmt;

public class Main {
   public static void main(String[] args) {
      Artist one = new Artist("Milan", "Arif", 25);


      DbHandler.add(one);

      DbHandler.showAll();

   }
}