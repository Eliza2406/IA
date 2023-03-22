import java.io.*; 
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.math.RoundingMode;  
import java.text.DecimalFormat;


public class HorseMenu
{
   public static void main(String[] args) throws Exception
   {
      while(true) 
      {
         menu();		  
      }
   			
   
   }  // ends main
   
   // Static Methods
   
   
   public static void menu() throws Exception
   {
   
   /**************  File read and Array Object Creation  *********************************/
   
     
    // Declarations     
      HorseBoardRes3 [] horseArr = new HorseBoardRes3[25];  // Declare & Crate Array to hold horse Objects
         
      int record = 0 ; // number of records
   // Create a File instance or object
      File file = new File("HorseData2.txt");  // File Pointer to Data File
   // Create a Scanner for the file
      Scanner input1 = new java.util.Scanner(file);
      
   // Read from File and load
      
      while (input1.hasNext()) 
      {
         String fLine = input1.nextLine();
         horseArr[record] = new HorseBoardRes3(fLine); // use Resource constructor with Parser to create and intialize object array element
         record = record + 1;
      } // loop until no more lines in file
   
    // Close the file
      input1.close();
         
      System.out.println("Data file has " + record  + " horse records\n");
   
      
      
   
    
   
   /**************  MENU CHOICES Loop *********************************/
      int choice = menuChoice();
   
   // top of loop 
      do {     
      
         if (choice == 1)   // View Horse Objects 
         {
         
            viewHorse(horseArr, record);		 
           
         }
         else if (choice==2) 
         {
            HorseDriver2 addHorse = new HorseDriver2();
            addHorse.AddHorse();
         
         }	
         
         else if (choice==3) 
         {
            ;
           // revenue(horseArr);
         
         }
         
          
         else if (choice==4) 
         {
            quit();
         
         }
      
      
         choice = menuChoice();	  // get users choice for reloop
      
      
      
      }while( (choice >= 1 ) && (choice < 6)  ) ;   // loop on do-while loop
     
   } // end menu method

   public static int menuChoice() 
   {
    
      String prompt =   "Welcome to Horse Board! \nPlease select from the following options: "
                        + "\n \n 1. View Horse Objects"
         				   + "\n 2. Add Horse to Data File"
                        +"\n 3. Search for Horse "
         				   + "\n 4. Calculate Revenue for Boarding Facility"
                        + "\n 5. Quit "
                        + "\n";
   						
      System.out.print(prompt);
     
      Scanner keyIn = new Scanner(System.in);
      int c = keyIn.nextInt();
      return c;
   
   } // end menuChoice method
     
   public static void viewHorse(HorseBoardRes3 [] arrayIn, int rec) 
   {
         System.out.println("Data file has " + record  + " horse records\n");
        // Print array Objects to screen
      for(int index = 0; index < rec; index++)
      {
                       
         arrayIn[index].state();
                            
      }
      
   
   
   }
   
   
  

     
     
     
   public static void processRecs(int arrayIn[], int arrayProcess[]) 
   {
         
      for(int i=0; i< 7; i++)	
         arrayProcess[i]= 2*arrayIn[i];
             
      for(int i=0; i< 7; i++)	
         System.out.println(arrayProcess[i]);
             
      pause();
             
   } // end method
     
   public static void pause()
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Press the to continue");
      kb.nextLine();
   		
   } // end pause method
   
   public static void quit()
   {
      System.out.println("Exiting program, Bye");
      System.exit(0);
   
   }

	  
 
   
}