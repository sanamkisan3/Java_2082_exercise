public class DataTypesSize {

    public static void main (string [] args){
    int number =1234567890;
    string stringvariable ="Hello";
    char charvariable ='h';
    short shortvariable = 12345;
    long longvariable = 1234567890000L;
    byte bytevariable = (byte) 3444;

    //Float ing-point 
    Float temperature = 36.667f;
    double gravity = 9.90665;
    //Integers 
    //int population = 8_000_000_000; //Error without L!
    long worLd pop=8_000_000_000L;
    //correct 
    //bases
    int binary = 0b1010;      //10
    int octal = 012;          //10
    int hex =0xA;             //10
    
    //other types 
    byte small =(byte) 127;
    char grade ='A';
    boolean is valid =true;
    string message ="Literals demo";
}
System.out.println("int says: I can hold big number like " + 1234567890);
System.out.println("string says:"+ stringvariable +"is my favorite word!");
System.out.println("char says: I'm just a lonely character ->" + charvariable);
System.out.println("short says:Don't underestimate me, I carry " + 12345);
System.out.println("long says:'I'm HUGE! Example:" + 1234567890000);


}