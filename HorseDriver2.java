import java.io.*;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class HorseDriver2 {
   public static void main(String[] args) throws IOException {
      HorseBoardRes3[] horseArr = new HorseBoardRes3[25];

      // Declare & Crate Array to hold horse Objects

      // Create a File instance or object

      /*
       * Scanner s = new Scanner(System.in);
       * 
       * print(horseArr);
       * 
       * System.out.println("Linear Search ");
       * System.out.print("Enter ID number: ");
       * 
       * int key = s.nextInt();
       * 
       * // pass in unsorted array
       * index = linearSearch(horseArr, key);
       * 
       * if(index < 0)
       * System.out.println("Integer not found in array");
       * else
       * System.out.println("Found matching element " + horseArr[index] + " at index "
       * + index);
       * 
       * System.out.println("bubble Sort the array");
       * 
       * bubbleSort(horseArr);
       * 
       * print(horseArr);
       */

      // counting # horse object and parsing into array of objects

      // Print array Objects to screen
      // for (int index = 0; index < record; index++) {

      //    horseArr[index].state();

      // }

      // AddHorse(horseArr);

   } // end main

   public void writeMethod(HorseBoardRes3[] horseArr) throws IOException{ 

      FileOutputStream stream = new FileOutputStream("HorseData2.txt");
      PrintWriter out = new PrintWriter(stream);
       
      for(int j = 0; j < horseArr.length; j++) {
         if (horseArr[j] == null) {
            break;
         }
         out.println(horseArr[j].fileState());
      }
      
      out.close();
      
   }

   public static HorseBoardRes3[] readMethod() throws IOException {
      File readFile = new File("HorseData2.txt");
      Scanner scan = new Scanner(readFile);
      int record = 0;
      HorseBoardRes3[] horseArr = new HorseBoardRes3[25];

      while (scan.hasNext()) {
         String fLine = scan.nextLine();
         HorseBoardRes3 horsey = new HorseBoardRes3();
         HorseBoardRes3 horse = new HorseBoardRes3("", "", "", 0, 0, 0, "", "");
         horseArr[record] = horse.HorseBoardRes3(); // use Resource constructor with Parser to create and intialize object array element
         record = record + 1;

         }
       } // loop until no more lines in file
   
   //  // Close the file
   //    input1.close();

   // }

   public void AddHorse() throws IOException {

      Scanner keyIn = new Scanner(System.in);

      System.out.println("Welcome to Horse Board!" + "\n");

      System.out.print("Please enter the breed of the horse (press enter to continue): ");
      String breed = keyIn.nextLine();

      System.out.print("Please enter the name of the horse: ");
      String name = keyIn.nextLine();

      System.out.print("Please enter the name of the owner: ");
      String owner = keyIn.nextLine();

      System.out.print("Please enter ID Number: ");
      int idNum = keyIn.nextInt();

      System.out.print("Please enter the age of the horse: ");
      int age = keyIn.nextInt();

      System.out.print("Please enter the weight of the horse: ");
      double weight = keyIn.nextDouble();

      System.out.print("Please enter the check-in date(yyyy-MM-dd): ");
      String checkIn = keyIn.next();

      System.out.print("Please enter the check-out date(yyyy-MM-dd): ");
      String checkOut = keyIn.next();

      HorseBoardRes3 newHorse = new HorseBoardRes3(breed, name, owner, idNum, age, weight, checkIn, checkOut);
      System.out.println(newHorse);

      for (int i = 0; i < horseArr.length; i++) {
         if (horseArr[i] == (null)) {
            System.out.println(i);
            horseArr[i] = newHorse;
            break;
         }
      }

      writeMethod(horseArr);
   }

}// end class