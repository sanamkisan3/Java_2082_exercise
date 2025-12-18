import java.util.Scanner;

public class Guess {

    int number;

    public Guess(int number) {
        this.number = number;
    }

    void guessNum() {

        Scanner input = new Scanner(System.in);
        boolean correct = true;

        while (correct) {
            System.out.print("Enter the number : ");
            int num = input.nextInt();

            if (num < number) {
                System.out.println("Your number is less than my guess");
            } 
            else if (num > number) {
                System.out.println("Your number is greater than my guess");
            } 
            else {
                System.out.println("Your number is equal to my guessing number");
                correct = false;
            }
        }
    }

    public static void main(String[] args) {

        Guess guess = new Guess(25);
        guess.guessNum();
    }
}