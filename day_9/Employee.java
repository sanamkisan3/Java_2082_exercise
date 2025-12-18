import java.util.Scanner;

 public class Employee {
    String name;
    double basicsalary;


    public Employee (String name, double basicsalary){
        this.name = name ;
        this.basicsalary= basicsalary;

    }
     void calculateBonus(){ 
     double bonus;
       if (basicsalary > 30000) {
        bonus = basicsalary * 0.10;
       }else{
        bonus = basicsalary *0.05;

       }
        System.out.println("Employee Name: " + name );
        System.out.println("Basicsalary :" + basicsalary);
        System.out.println("Bonus:" + bonus);
        System.out.println("Total salary :" + (basicsalary + bonus));
     }
    public static void main (String[] args){
        Employee emp = new Employee("sanam", 35000);
        emp.calculateBonus();
    }



}