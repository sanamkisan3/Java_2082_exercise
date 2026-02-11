
import java.util.Scanner;

public class AdvanceGuess {

     int number;
     int count=0;

     public AdvanceGuess(int number) {
        this.number = number;
     }

     void guessNum() {

     Scanner input = new Scanner(System.in);
     boolean correct = true;

     while (correct) {
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        count++;

        int distance = Math.abs(num - number);


        if (num < number) {
            System.out.println("Your number is less than my guess");
        } 
        else if (num > number) {
            System.out.println("Your number is greater than my guess");
        } 
        else {
            System.out.println(" Correct! You guessed the number.");
            correct = false;
            break;
        }


      
        if (distance <= 2) {
            System.out.println("You are Very Close to the number!");
        } 
        else if (distance <= 5) {
            System.out.println("You are Close to the number!");
        } 
        else if (distance <= 10) {
            System.out.println("You are Far from the number!");
        } 
        else {
            System.out.println("You are Very Far from the number!");
        }
     }
      System.out.println("You have guessed the number in " + count + " attempts");
     } 
     public static void main(String[] args) {

        AdvanceGuess advanceGuess = new AdvanceGuess(14);
        advanceGuess.guessNum();
    }
}
