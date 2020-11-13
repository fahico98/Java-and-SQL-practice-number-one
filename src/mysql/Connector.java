
package mysql;

import java.sql.*;

public class Connector{
   
   private final String
      USERNAME = "root",
      PASSWORD = "localhost",
      HOST = "jdbc:mysql://localhost",
      PORT = "3306",
      USE_SSL = "false",
      UNICODE = "true",
      TIMEZONE = "true",
      SERVER_TIMEZONE = "UTC",
      BASE_URL = HOST + ":" + PORT,
      URL_PARAMETERS = "?useSSL=" + USE_SSL + "&useUnicode=" + UNICODE + "&useTimezone=" + TIMEZONE +
         "&serverTimezone=" + SERVER_TIMEZONE + "&user=" + USERNAME + "&password=" + PASSWORD;
   
   public static final String DATABASE_NAME = "sql_practice_1";
   
   Connection connection;
   PreparedStatement statement;
   
   /**
    * 
    * @param database 
    */
   public Connector(String database){
      try{
         connection = DriverManager.getConnection(BASE_URL + "/" + database + URL_PARAMETERS);
      }catch(SQLException e){
         System.out.println("\nERROR: " + e.getMessage());
      }
   }
   
   public Connector(){
      try{
         connection = DriverManager.getConnection(BASE_URL + URL_PARAMETERS);
      }catch(SQLException e){
         System.out.println("\nERROR: " + e.getMessage());
      }
   }
   
   public boolean createDatabase(){
      try{
         statement = connection.prepareStatement("CREATE DATABASE IF NOT EXISTS " + DATABASE_NAME);
         statement.execute();
         statement = connection.prepareStatement("USE " + DATABASE_NAME);
         return true;
      }catch(SQLException e){
         System.out.println("\nERROR: " + e.getMessage());
      }
      return false;
   }
   
   public boolean selectQuery(String query){
      return true;
   }
   
   public boolean updateQuery(String query){
      return true;
   }
   
   public boolean insertQuery(String query){
      return true;
   }
   
   public boolean deleteQuery(String query){
      return true;
   }
}
