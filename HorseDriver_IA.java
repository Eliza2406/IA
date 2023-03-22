import java.io.File;  
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.math.RoundingMode;  
import java.text.DecimalFormat;
 

public class HorseDriver_IA
{
   public static void main(String[] args) throws Exception
   { 
   
    while(true) 
      {
         menu();		  
      }
} // new main method end  


// New Static Methods
 
    public static void menu() throws Exception
   {       
       
        // Declarations
       
      HorseBoardRes3 [] horseArr = new HorseBoardRes3[25];  // Declare & Crate Array to hold horse Objects
         
      int record = 0 ; // number of records
   // Create a File instance or object
      File file = new File("HorseData1.txt");  // File Pointer to Data File
   // Create a Scanner for the file
      Scanner input1 = new java.util.Scanner(file);
      
      
            int choice = menuChoice();
   
   // top of loop 
      do {     
      
         if (choice == 1)   // Review Array of Objects 
         {
         
            reviewArray(records);		 
           
         }
         else if (choice==2) 
         {
         
            //add new horse object 
         
         }	

         
          else if (choice==3) 
         {
            quit();
         
         }
      
      
         choice = menuChoice();	  // get users choice for reloop
      
      
      
      }while( (choice >= 1 ) && (choice < 4)  ) ;   // loop on do-while loop
     
   } // end menu method

   public static int menuChoice() 
   {
   
         String prompt = "Welcome to horse board! " 
                        + "\n Please choose from the following options: " 
                        + "\n 1) Review (subset) of array of your Object"
         				   + "\n 2) Add new horse object"
         				   + "\n 3) Quit"
         				   + "\n Enter your choice: ";
   						
      System.out.print(prompt);
     
      Scanner keyIn = new Scanner(System.in);
      int c = keyIn.nextInt();
      return c;
   
   } // end menuChoice method
     
   public static void reviewArray(int arrayIn[]) 
   {
      System.out.println("Review created Array of Objects");
      
      
      pause();
   
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
      System.out.print("Press 'Enter' to continue");
      kb.nextLine();
   		
   } // end pause method
   
   public static void quit()
   {
      System.out.println("Exiting program, Bye");
      System.exit(0);

}


         /*   Scanner s = new Scanner(System.in);
   
   print(horseArr);
   
    System.out.println("Linear Search ");		
      System.out.print("Enter ID number: ");
      
     int key = s.nextInt(); 
   	
   	// pass in unsorted array
      index = linearSearch(horseArr, key);
   	
      if(index < 0)
         System.out.println("Integer not found in array");
      else 
         System.out.println("Found matching element " + horseArr[index] + " at index " + index);
   
      System.out.println("bubble Sort the array");
   
      bubbleSort(horseArr);
   		
      print(horseArr);
   */
   
   // counting # horse object and parsing into array of objects
      while (input1.hasNext()) {
         String fLine = input1.nextLine();
         horseArr[record] = new HorseBoardRes3(fLine); // use Resource constructor with Parser to create and intialize object array element
         record = record + 1;
      } // loop until no more lines in file
   
   
    // Close the file
      input1.close();
         
      System.out.println("Data file has " + record  + " horse records\n");
         
         // Print array Objects to screen
      for(int index = 0; index < record; index++)
      {
                       
         horseArr[index].state();
              
               
      }            
       
         

   
}//end class