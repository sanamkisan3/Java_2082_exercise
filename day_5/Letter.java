import java.util.Scanner;

public class Letter {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

       System.out.println("Enter a letter ");

       char letter = input.next().charAt(0);


        switch(letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
              System.out.println(letter +"is a vowel letter ");
              break;
         default:
            System.out.println(letter +"is  a consonant");

        }
        input.close();


    }
}