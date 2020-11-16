
package models.orm;

import java.sql.SQLException;

import mysql.SQL;

public class UserDatabaseManager {
   
   private final String[] FIELDS = new String[]{
      "id",
      "name",
      "lastname",
      "age",
      "gender",
      "phone_number",
      "email",
      "username",
      "password"
   };
   
   private final String[] TYPES_OF_FIELDS = new String[]{
      "INT(15) NOT NULL AUTO_INCREMENT PRIMARY KEY",
      "VARCHAR(100) NOT NULL",
      "VARCHAR(100)",
      "INT(2)",
      "VARCHAR(1) NOT NULL",
      "VARCHAR(25)",
      "VARCHAR(50)",
      "VARCHAR(50)",
      "VARCHAR(255)"
   };
   
   private SQL sql = new SQL();
   
   protected boolean createUserTable(){
      
      try{
         
         String query = "CREATE TABLE IF NOT EXISTS user (";
         
      }catch(SQLException e){
         System.out.println("\nERROR: " + e.getMessage());
      }
      
      return false;
   }
   
   protected boolean validateUniqueId(long id){
      
      return true;
   }
}
