//name: Sara Russert
//date: 1/5/24
//file: BinaryToDecimal.java

/**
   Lab 3 Part 1 Problem to solve:
   Convert a four character binary number to 
   equivalent base ten representation
*/

//import statement for Scanner class
import java.util.Scanner;

public class BinaryToDecimal
{
   public static void main(String[] args)
   {
      //declare string variable to store user input for binary number
      String inputString;
      
      //declare char variables to store each individual character of the inputString
      char char3, char2, char1, char0;
            
      //declare byte variables to store the integer version of each char
      //note that the integer data type that requires least amount of RAM is a byte
      byte byte3, byte2, byte1, byte0;
      
      //declare integer variable to store base ten representation of the binary number
      int decimalValue;
      
      //create Scanner object to read keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //use Scanner object to collect user input for the inputString
      System.out.println("Use Scanner object to collect user input:");
      System.out.print("Enter a four digit binary number (no spaces):  ");
      inputString = keyboard.nextLine();
      System.out.println("You entered: " + inputString);
      
      //decompose inputString into its individual chars
      char0 = inputString.charAt(3);
      char1 = inputString.charAt(2);
      char2 = inputString.charAt(1);
      char3 = inputString.charAt(0);
      
      //cast each char to a string and then to a byte  
      byte0 = Byte.parseByte(Character.toString(char0));
      byte1 = Byte.parseByte(Character.toString(char1));
      byte2 = Byte.parseByte(Character.toString(char2));    
      byte3 = Byte.parseByte(Character.toString(char3));

      //Display the byte version of each char          
      System.out.println("byte3: " + byte3 + "; byte2: " + byte2 
                         + "; byte1: " + byte1 + "; byte0: " + byte0);
      
      //compute the base ten representation
      //note that Math.pow( ) returns a double, so this must be cast to an int 
      //to permit storing result in an int
      //initialize decimalValue with the value of the left most digit
      decimalValue = byte3 * (int)Math.pow(2, 3);
      //use combined assignment operator to increment decimalValue by value next digit
      decimalValue += byte2 * (int)Math.pow(2, 2);
      //use combined assignment operator to increment decimalValue by value next digit
      decimalValue += byte1 * (int)Math.pow(2, 1);
      //use combined assignment operator to increment decimalValue by value next digit
      decimalValue += byte0 * (int)Math.pow(2, 0);

      //display results to the user
      System.out.print("The base ten representation of " + inputString + " is:  ");
      System.out.println(decimalValue);    
   }
}

