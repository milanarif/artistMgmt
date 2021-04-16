package mgmt;

public class Artist {

   String name;
   String lastName;
   int age;

   public Artist(String name, String lastName, int age) {
      this.name = name;
      this.lastName = lastName;
      this.age = age;
   }

   public String getName() {
      return this.name;
   }

   public String getLastName() {
      return this.lastName;
   }

   public int getAge() {
      return this.age;
   }
}
