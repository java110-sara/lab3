//name: Sara Russert
//date: 1/5/24
//file: MinuteConverter.java
//student code; missing code and has bugs
/*
   Lab 3 Part 2 Problem to solve:
   Given a specified number of minutes, convert these to the 
   equivalent number of days, hours and minutes.
*/

import java.util.Scanner;

public class MinuteConverter
{
   public static void main(String[] args)
   {
      //declare constants for num minutes in an hour and in a day
      final int NUM_HOUR_MINUTES = 60;
      final int NUM_DAY_MINUTES = NUM_HOUR_MINUTES * 24;
      
      //declare int variables to store original minutes, remaining minutes, 
      //num hours and num days
      int originalMins, remainingMins, numHours, numDays;
      
      //create Scanner object to read keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //use Scanner object to collect user input for the number of original minutes
      System.out.println("Use Scanner object to collect user input for an integer:");
      System.out.print("Enter an integer for the number of minutes to convert:  ");
      originalMins = keyboard.nextInt(); //create bug by using nextLine instead of nextInt*************
      System.out.println("You entered " + originalMins + " minutes");
      
      //determine how many days this is equivalent to
      numDays = (originalMins / NUM_DAY_MINUTES);
      
      //determine how many minutes remain after removing day mins
      remainingMins = originalMins % NUM_DAY_MINUTES;
      
      //determine how many hours are in these remaining minutes
      numHours = remainingMins / NUM_HOUR_MINUTES;
      
      //determime how many minutes remain after removing hour mins
      remainingMins = originalMins % NUM_HOUR_MINUTES;
      
      //display results to the user
      System.out.println(originalMins + " minutes are equivalent to:");
      System.out.println("Days: " + numDays);
      System.out.println("Hours: " + numHours);
      System.out.println("Minutes: " + remainingMins);

   }
}


