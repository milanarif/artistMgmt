package ui;

import dbmgmt.Artist;

public class Tables {
   public static void TableHeader() {
      System.out.println("\nID     Name              Age");
      System.out.println("-----  ----------------  -----");
   }

   public static void printArtist(int id, String name, String lastName, int age) {
      System.out.printf("%-7d", id);
      String compactName = name.charAt(0) + ". " + lastName;
      if (compactName.length() > 16) {
         System.out.printf("%-19s", compactName.substring(0, 14)+"..");
      } else {
         System.out.printf("%-19s", compactName);
      }
      System.out.printf("%-7d", age);
      System.out.println("");
   }
}
