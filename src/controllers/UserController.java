
package controllers;

import mysql.Connector;
import util.DataFaker;

public class UserController {
   
   private Connector connector;
   private DataFaker faker;
   
   public UserController(){
      connector = new Connector();
      faker = new DataFaker();
      connector.createDatabase();
   }
   
}
