import java.util.Scanner;
 class TT {
    String model;
    int year;
    
    TT(String m,int y){
        model = m;
        year = y;

    }
}
    public class Car{
    public static void main(String[] args){
        TT car =new TT ("Toyota", 2022);

        System.out.println("model:"+ car.model);
        System.out.println("year:" + car.year);
    }
}