
package util;

import mysql.Connector;

public class UsersSeeder{
   
   private final int DEFAULT_TABLE_SIZE = 500;
   
   private DataFaker faker;
   private Connector connector;
   
   public UsersSeeder(){
      faker = new DataFaker();
   }
   
   public boolean populate(int n){
      
      
      
      return true;
   }
}
