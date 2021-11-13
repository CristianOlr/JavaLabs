package Lab8.Ex7;// Fig. 8.6: Time2Test.java
// Overloaded constructors used to initialize Time2 objects.

public class Time2Test 
{
   public static void main(String[] args)
   {
      Time2 t = new Time2(0, 0, 0);

      t = new Time2(8, 15, 47);
      displayTime("Time before change:", t);
      t.trick(0,0,1);
      displayTime("After adding 1 second:", t);
      System.out.println();

      t = new Time2(8, 15, 47);
      displayTime("Time before change:", t);
      t.trick(0,1,1);
      displayTime("After adding 1 second and 1 minute:", t);
      System.out.println();

      t = new Time2(8, 15, 47);
      displayTime("Time before change:", t);
      t.trick(1,1,1);
      displayTime("After adding 1 second, 1 minute and 1 hour:", t);
      System.out.println();

      t = new Time2(23, 59, 59);
      displayTime("Time before change:", t);
      t.trick(0,0,1);
      displayTime("After adding 1 second:", t);
      System.out.println();

      t = new Time2(23, 59, 0);
      displayTime("Time before change:", t);
      t.trick(0,1,0);
      displayTime("After adding 1 minute:", t);
      System.out.println();

      t = new Time2(23, 0, 0);
      displayTime("Time before change:", t);
      t.trick(1,0,0);
      displayTime("After adding 1 hour:", t);
      System.out.println();

      t = new Time2(23, 58, 59);
      displayTime("Time before change:", t);
      t.trick(0,1,1);
      displayTime("After adding 1 second and 1 minute:", t);
      System.out.println();

      t = new Time2(22, 59, 59);
      displayTime("Time before change:", t);
      t.trick(1,0,1);
      displayTime("After adding 1 second and 1 hour:", t);
      System.out.println();

      t = new Time2(22, 58, 59);
      displayTime("Time before change:", t);
      t.trick(1,1,1);
      displayTime("After adding 1 second, 1 minute and 1 hour:", t);
      System.out.println();
   }


   // displays a Time2 object in 24-hour and 12-hour formats
   private static void displayTime(String header, Time2 t)
   {
      System.out.printf("%n%s%n   %s%n   %s",
         header, t.toUniversalString(), t.toString());
   } 
} // end class Time2Test

