import java.util.Scanner;  //import statement

 public class IT24104201Lab5Q3 {  //class definition

 //It defines three constants
 public static final int roomChargePerDay= 48000; 
 public static final double discount1=0.10; 
 public static final double discount2=0.20; 

 public static void main(String[] args) { //main method

  Scanner input=new Scanner(System.in); //create a Scanner object
  
  System.out.print("Enter Start Date (1-31):"); //input the start date
  int sDate=input.nextInt();

  System.out.print("Enter End Date (1-31):"); //input the end date
  int eDate=input.nextInt();

  //conditional statements
  if (1>sDate||sDate>32||1>eDate||eDate>32) {
      System.out.println("Error: Days must be between 1 and 31"); return; }

  if (sDate>eDate) {
       System.out.println("Error: Start Date must be less than End Date"); return; }

  System.out.println(""); //It prints blank line

  System.out.println("Room Charge Per Day: Rs. 48000.0/="); //print the Room Charge Per Day: Rs. 48000.0/=

  System.out.print("Number of Days Reserved:"); //input the Number of Days Reserved
  int noOfDays=input.nextInt();

  double totalCost= noOfDays * roomChargePerDay; //calculate the total cost

  double tAmount1 = totalCost; 
  double tAmount2 = totalCost-(totalCost*discount1); //calculate the amount with discount
  double tAmount3 = totalCost-(totalCost*discount2);
  
  if (noOfDays<3) {
        System.out.println("Total Amount to be Paid:"+tAmount1); } //print the total amount paid to be
  else if (noOfDays==3||noOfDays==4) {
        System.out.println("Total Amount to be Paid:"+tAmount2); }
  else {
        System.out.println("Total Amount to be Paid:"+tAmount3); }

 }
}
