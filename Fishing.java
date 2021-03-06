   /**This programs serves as a .class file. It contains a series of 
   methods that include a constructor method, a method that will simulate a die, 
   and a getter method that will get the value of the die that is rolled.**/
   
import java.util.Random;

public class Fishing
{
   //private data fields
   private int sides;
   private int value;
   
   //contructor with 1 argument
   public Fishing(int numSides)
   {
      sides = numSides;
      goFish();
   }   
   
   //method that will simulated a die
   public void goFish()
   {
      Random dice = new Random();
      value = dice.nextInt(sides) + 1;
   }
   
   //getter method to recieve the value of the rolled die
   public int getValue()
   {
   return value;
   }
}
   
      
      