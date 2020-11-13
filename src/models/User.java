
package models;

public class User {
   
   private String name, lastname, phoneNumber, username;
   private long id;
   private int age;
   private char gender;
   
   public User(String name, String lastname, String phoneNumber, String username, long id, int age, char gender){
      this.name = name;
      this.lastname = lastname;
      this.phoneNumber = phoneNumber;
      this.username = username;
      this.id = id;
      this.age = age;
      this.gender = gender;
   }
   
   public User(){
      this.name = "";
      this.lastname = "";
      this.phoneNumber = "";
      this.username = "";
      this.id = 0;
      this.age = 0;
      this.gender = 'x';
   }

   /**
    * @return the name
    */
   public String getName() {
      return name;
   }

   /**
    * @param name the name to set
    */
   public void setName(String name) {
      this.name = name;
   }

   /**
    * @return the lastname
    */
   public String getLastname() {
      return lastname;
   }

   /**
    * @param lastname the lastname to set
    */
   public void setLastname(String lastname) {
      this.lastname = lastname;
   }

   /**
    * @return the phoneNumber
    */
   public String getPhoneNumber() {
      return phoneNumber;
   }

   /**
    * @param phoneNumber the phoneNumber to set
    */
   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   /**
    * @return the username
    */
   public String getUsername() {
      return username;
   }

   /**
    * @param username the username to set
    */
   public void setUsername(String username) {
      this.username = username;
   }

   /**
    * @return the id
    */
   public long getId() {
      return id;
   }

   /**
    * @param id the id to set
    */
   public void setId(long id) {
      this.id = id;
   }

   /**
    * @return the age
    */
   public int getAge() {
      return age;
   }

   /**
    * @param age the age to set
    */
   public void setAge(int age) {
      this.age = age;
   }

   /**
    * @return the gender
    */
   public char getGender() {
      return gender;
   }

   /**
    * @param gender the gender to set
    */
   public void setGender(char gender) {
      this.gender = gender;
   }
}
