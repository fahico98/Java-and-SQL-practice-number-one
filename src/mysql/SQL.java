
package mysql;

import java.sql.SQLException;

public class SQL{
   
   private Connector connector;
   
   /**
    * Método constructor por defecto.
    */
   public SQL(){
      connector = new Connector();
   }
   
   /**
    * Método para cambiar el nombre de la base de datos a la cual se le
    * realizaran consultas.
    * 
    * @param newDatabase nombre de la nueva base de datos.
    */
   public void chageDatabase(String newDatabase){
      connector.setDatabaseName(newDatabase);
   }
   
   /**
    * Ejecuta una consulta de tipo SELECT.
    * 
    * @param query consulta a ser ejecutada.
    * @return ResultSet con los datos obtenidos por la consulta.
    */
   public boolean executeSelectQuery(String query){
      
      try{
         
         if(!connector.connect()) return false;
         connector.statement = connector.connection.prepareStatement(query);
         if(!connector.disconnect()) return false;
         return connector.statement.execute();
         
      }catch(SQLException e){
         System.out.println("\nERROR: " + e.getMessage());
      }
      
      return false;
   }
   
   /**
    * Ejecuta una consulta de tipo UPDATE, INSERT INTO, DELETE o de otro tipo.
    * 
    * @param query consulta a ejecutar.
    * @return true si la consulta fue ejecutada con exito, false si ocurrió
    * algún error.
    */
   public boolean executeQuery(String query){
      try{
         
         if(!connector.connect()) return false;
         connector.statement = connector.connection.prepareStatement(query);
         if(!connector.disconnect()) return false;
         connector.statement.execute();
         return true;
         
      }catch(SQLException e){
         System.out.println("\nERROR: " + e.getMessage());
      }
      
      return false;
   }
}
