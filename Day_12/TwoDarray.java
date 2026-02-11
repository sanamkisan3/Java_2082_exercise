import jav.util.Scanner;
 public class TwoDarray{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

     int[][]numbers = new int[2][3];
     System.out.println("Enter the number of  row and columns ");
      
       for (int i = 0; i < numbers.length; i++) {  
            for (int j = 0; j < numbers[i].length; j++) {  
                System.out.print(numbers[i][j] + " ");  
            }  
              System.out.println();  


        


    }
 }