//Elizabeth Nichols

import java.time.*;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.math.RoundingMode;  
import java.text.DecimalFormat;
 
public class HorseBoardRes3
{
 
     //initializations
   private String breed;
   private String name;
   private String owner;
   private int idNum;
   private int age;
   private double weight;
   private double cost;
   private String checkIn;
   private String checkOut;
   private long durStay;
   private String charge;
     
     
   public HorseBoardRes3(String breed, String name, String owner, int idNum, int age, double weight, String checkIn, String checkOut)
   {
      this.breed = breed;
      this.name = name;
      this.owner = owner;
      this.idNum = idNum;
      this.age = age;
      this.weight = weight;
      this.cost = cost;
      this.checkIn = checkIn;
      this.checkOut = checkOut;
   }
   
   public HorseBoardRes3(String fline)
   {
   
      // know field structure data file: 8 fields
      String str;  
         
      // parsed horse breed
      int location = 0;
      int start = 0;
     
      location = fline.indexOf(",",start);
      breed = fline.substring(start,location);
        
      // parsed horse name
      start = location + 1;
      location = fline.indexOf(",",start);
   
      name = fline.substring(start,location);
      
       // parsed owner name 
      start = location + 1;
      location = fline.indexOf(",",start);
   
      owner = fline.substring(start,location);
   
      // parsed idNum
      start = location + 1;
      location = fline.indexOf(",",start);
      str = fline.substring(start,location);
   
      idNum = Integer.parseInt(str); 
           
         // parsed age of horse
      start = location + 1;
      location = fline.indexOf(",",start);
      str = fline.substring(start,location);
         
      age = Integer.parseInt(str);
         
         // parsed weight of horse
      start = location + 1;
      location = fline.indexOf(",",start);
      str = fline.substring(start,location);
         
      weight =  Double.parseDouble(str);        
         
         // parsed check in date
      start = location + 1;
      location = fline.indexOf(",",start);
      str = fline.substring(start,location);
         
      checkIn = str;
   
        // parsed check out date
      start = location + 1;
      location = fline.indexOf(",",start);
      str = fline.substring(start);
         
      checkOut = str;
      
      
      // converting from string to date
      DateTimeFormatter dates = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      
      LocalDate checkInDate  = LocalDate.parse(checkIn,dates);
    
      LocalDate checkOutDate = LocalDate.parse(checkOut,dates);
      
      //durStay = ChronoUnit.MONTHS.between(checkInDate,checkOutDate);
      durStay = durStay + ChronoUnit.DAYS.between(checkInDate,checkOutDate);
      
      
      // calculating cost of stay
     
      cost = durStay*21.95;
      
      DecimalFormat decfor = new DecimalFormat("0.00");  
   
      charge = decfor.format(cost);
   
      
   }  // end parse constructor method
   
   
      
   public void state()
   {
      String state;
      state = 
           "ID number: " + idNum + "\n" +
           "Owner name: " + owner + "\n" +
           "Horse name: " + name + "\n" +
           "Breed: " + breed + "\n" +
           "Age of horse: " + age + "\n" +
           "Weight of horse: " + weight + " lbs" + "\n" +
           "Check in date: " + checkIn + "\n" +
           "Check out date: " + checkOut + "\n" +
           "Duration of stay: " + durStay + " days" + "\n" +
           "Cost of stay: $" + charge;
           
      System.out.println(state + "\n");
   }
      public String fileState()
   {
      String state;
      state = breed + "," +
              name + "," +
              owner + "," +
              idNum + "," +
              age + "," +
              weight + "," +
              checkIn + "," +
              checkOut;
            //   durStay + "," +
            //   charge; 
            /*
             *im not sure what you want to do with charge and dur stay because it wasn't in your constructer
             *but still placed it in the state commented out
             */
            
      return state;
   }

}
