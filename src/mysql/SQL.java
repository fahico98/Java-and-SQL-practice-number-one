
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
    * @param fields campos a seleccionar.
    * @param table nombre de la tabla.
    * @param terms condiciones de la consulta.
    * @param values valores de las condiciones.
    * @param typesOfValues tipo de los valores de las condiciones.
    * @return ???
    */
   public boolean selectQuery(String fields, String table, String terms, String[] values, String[] typesOfValues){
      
      try{
         
         if(!connector.connect()) return false;
         connector.statement = connector.connection.prepareStatement(
            "SELECT " + fields + " FROM " + table + " WHERE (" + terms + ")"
         );
         
         for(int i = 0; i < values.length; i++){
            switch(typesOfValues[i]){
               
               case "String":
                  connector.statement.setString(i + 1, values[i]);
                  break;
               case "Integer":
                  connector.statement.setInt(i + 1, Integer.parseInt(values[i]));
                  break;
               case "Double":
                  connector.statement.setDouble(i + 1, Double.parseDouble(values[i]));
                  break;
               case "Boolean":
                  connector.statement.setBoolean(i + 1, Boolean.parseBoolean(values[i]));
                  break;
            }
         }
         
         connector.statement.execute();
         return connector.disconnect();
         
      }catch(SQLException e){
         System.out.println("\nERROR: " + e.getMessage());
      }
      
      return false;
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
