package mgmt;

import java.sql.*;

public class DbHandler {
   private static final String dbURL = "jdbc:mysql://localhost:3306/artistdb";
   private static final String dbUsr = "root";
   private static final String dbPass = "root";

   public static void add(Artist artist) {
      try {
         Connection connection = DriverManager.getConnection(dbURL, dbUsr, dbPass);

         String insert = "INSERT INTO artists (name, lastName, age) VALUES (?, ?, ?)";

         PreparedStatement statement = connection.prepareStatement(insert);
         statement.setString(1, artist.getName());
         statement.setString(2, artist.getLastName());
         statement.setInt(3, artist.getAge());

         statement.executeUpdate();

         connection.close();
      }
      catch (SQLException e) {
      e.printStackTrace();
      }
   }

   public static void showAll() {
      try {
         Connection connection = DriverManager.getConnection(dbURL, dbUsr, dbPass);

            String showAll = "SELECT * FROM artists";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(showAll);

            while (result.next()) {
               System.out.println(result.getString("id") + " " + result.getString("name") + " " + result.getString("lastName") + " " + result.getString("age"));
            }

            connection.close();
         }
         catch (SQLException e) {
            e.printStackTrace();
         }
   }

   public static void updateStringField(int id, String field, String replacement) {
      try {
         Connection connection = DriverManager.getConnection(dbURL, dbUsr, dbPass);

         String update = "UPDATE artists SET " + field +" = ? WHERE id = ?";

         PreparedStatement statement = connection.prepareStatement(update);
         statement.setString(1, replacement);
         statement.setInt(2, id);

         statement.executeUpdate();

         connection.close();
      }
      catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public static void updateIntField(int id, String field, int replacement) {
      try {
         Connection connection = DriverManager.getConnection(dbURL, dbUsr, dbPass);

         String update = "UPDATE artists SET " + field +" = ? WHERE id = ?";

         PreparedStatement statement = connection.prepareStatement(update);
         statement.setInt(1, replacement);
         statement.setInt(2, id);

         statement.executeUpdate();

         connection.close();
      }
      catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public static void findById(int id) {
      try {
         Connection connection = DriverManager.getConnection(dbURL, dbUsr, dbPass);

         String findId = "SELECT * FROM artists WHERE id = ?";
         PreparedStatement statement = connection.prepareStatement(findId);
         statement.setInt(1, id);

         ResultSet result = statement.executeQuery();

         while (result.next()) {
            System.out.println(result.getString("id") + " " + result.getString("name") + " " + result.getString("lastName") + " " + result.getString("age"));
         }
         connection.close();
      }
      catch (SQLException e) {
         e.printStackTrace();
      }
   }
}
