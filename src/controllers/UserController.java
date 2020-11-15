
package controllers;

import mysql.Connector;
import util.UsersSeeder;
import util.DataFaker;

public class UserController {
   
   private Connector connector;
   private DataFaker faker;
   
   /**
    * Método constructor.
    */
   public UserController(){
      faker = new DataFaker();
   }
   
   /**
    * Método para crear la tabla de usuarios.
    * 
    * @return: True si la tabla de usuarios se ha creado satisfactoriamente,
    * false si se presenta algún error.
    */
   private boolean createUserTable(){
      return true;
   }
   
   /**
    * Método para llenar la tabla de usuarios.
    * 
    * @param n: Número entero que indica el número de registros que tendrá la
    * tabla de usuarios cuando se invoca al método.
    * 
    * @return: True si la tabla de usuarios se ha llenado satisfactoriamente,
    * false si se presenta algún problema.
    */
   private boolean populateUserTable(int n){
      return true;
   }
}
