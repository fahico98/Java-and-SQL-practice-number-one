
package models.orm;

import mysql.Connector;
public class UserDatabaseManager {
   
   private static final Connector CONNECTOR = new Connector();
   
   protected boolean validateUniqueId(long id){
      
      return true;
   }
}
