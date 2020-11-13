
import controllers.UserController;
import util.UsersSeeder;

public class Index{
   
   public static void main(String[] args){
      
      UserController controller = new UserController();
      UsersSeeder usersSeeder = new UsersSeeder();
      
      usersSeeder.populate(5);
   }
}


















