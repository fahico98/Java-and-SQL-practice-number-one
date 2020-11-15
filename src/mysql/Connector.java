
package mysql;

import java.sql.*;

public class Connector{
   
   /**
    * Constantes ***************************************************************
    */
   
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
   
   /**
    * Atributos estaticos ******************************************************
    */
   
   private static final String DEFAULT_DATABASE_NAME = "sql_practice_1";
   public static String defaultDatabaseName;
   
   /**
    * Atributos ****************************************************************
    */
   
   private String databaseName;
   
   protected Connection connection;
   protected PreparedStatement statement;
   
   /**
    * Métodos ******************************************************************
    */
   
   /**
    * Método constructor que crea una instancia de la clase que se conectará con
    * la base de datos cuyo nombre se le entrega por parametro.
    * 
    * @param database nombre de la base de datos con la que se conectará.
    */
   public Connector(String database){
      defaultDatabaseName = database;
      this.databaseName = database;
   }
   
   /**
    * Método constructor por defecto que crea una instancia de la clase que se
    * conectará con la base de datos que tiene el nombre que se almacena en la
    * constante DEFAULT_DATABASE_NAME.
    */
   public Connector(){
      defaultDatabaseName = DEFAULT_DATABASE_NAME;
      this.databaseName = DEFAULT_DATABASE_NAME;
   }
   
   /**
    * Realiza la conexón con la base de datos y llama al método createDatabase.
    * 
    * @return true si la creación de la base de datos y su 
    */
   protected boolean connect(){
      try{
         connection = DriverManager.getConnection(BASE_URL + URL_PARAMETERS);
         return createDatabase();
      }catch(SQLException e){
         System.out.println("\nERROR: " + e.getMessage());
      }
      return false;
   }
   
   /**
    * Cierra la conexión con la base de datos.
    * 
    * @return true si el cierre fue exitoso, false en caso de un error.
    */
   protected boolean disconnect(){
      try{
         connection.close();
         return true;
      }catch(SQLException e){
         System.out.println("\nERROR: " + e.getMessage());
      }
      return false;
   }
   
   /**
    * Crea la base de datos con el nombre almacenado en el atributo databaseName
    * si esta aún no existe.
    * 
    * @return true si la base de datos fue creada con exito y false en caso de
    * que ocurriera algun error.
    */
   private boolean createDatabase(){
      
      try{
         
         statement = connection.prepareStatement("CREATE DATABASE IF NOT EXISTS ?");
         statement.setString(1, getDatabaseName());
         statement.execute();
         
         statement = connection.prepareStatement("USE ?");
         statement.setString(1, getDatabaseName());
         statement.execute();
         
         return true;
         
      }catch(SQLException e){
         System.out.println("\nERROR: " + e.getMessage());
      }
      
      return false;
   }
   
   /**
    * Métodos getters y setters ************************************************
    */

   /**
    * @return el atributo databaseName.
    */
   public String getDatabaseName() {
      return databaseName;
   }

   /**
    * @param databaseName la cadena de caracteres databaseName para establecer.
    */
   public void setDatabaseName(String databaseName) {
      this.databaseName = databaseName;
      defaultDatabaseName = databaseName;
   }
}
