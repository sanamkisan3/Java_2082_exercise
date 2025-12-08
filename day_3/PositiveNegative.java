
import  java.util.Scanner;
 public class PositiveNegative {
     public static void main (String []args)
     {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number ");
          int number=input.nextInt();
          if (number > 0){
          System.out.println("The number is Positive ");

            }
            else if (number < 0){
                System.out.println("The number is Negative ");

               } else if ( number == 0){
                    System.out.println( "The number is Zero");

                }
              input.close();
            }
 }