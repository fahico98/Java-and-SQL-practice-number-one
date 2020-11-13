
package util;

import com.github.javafaker.Faker;
import java.util.Locale;

public class DataFaker {
 
   private Faker faker;
   private final String LOCALE = "es-MX";
   
   public DataFaker(){
      this.faker = new Faker(new Locale(LOCALE));
   }
   
   public String generateName(){
      return faker.name().firstName();
   }
   
   public String generateLastName(){
      return faker.name().lastName();
   }
   
   public String generateUsername(){
      return faker.name().username();
   }
   
   public String generatePhoneNumber(){
      return faker.phoneNumber().cellPhone();
   }
   
   public long generateId(){
      return faker.number().numberBetween(1000000000L, 9999999999L);
   }
   
   public int generateAge(){
      return faker.number().numberBetween(18, 80);
   }
}
