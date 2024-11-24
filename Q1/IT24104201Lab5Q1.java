import java.util.Scanner ; //import statement

 public class IT24104201Lab5Q1 {  //class definition
  public static void main(String[] args) {  //main method

  Scanner input=new Scanner(System.in); //create a Scanner object
  
  System.out.print("Enter the first integer:"); //input the first number
  int num1=input.nextInt();

  System.out.print("Enter the second integer:"); //input the second number
  int num2=input.nextInt();

  System.out.print("Enter the third integer:");  //input the third number
  int num3=input.nextInt();

  System.out.println(); //print a blank line

  System.out.println("User entered numbers are:" +num1 +" "+num2+" "+num3); // display the entered three numbers

  //conditional statements (display the smallest number and largest number)
  if (num1<num2 && num1<num3) {
     System.out.println("The smallest number is:"+num1); }
  else if (num2<num1 && num2<num3) {
     System.out.println("The smallest number is:"+num2); }
  else {
     System.out.println("The smallest number is:"+num3); } 

  if (num1>num2 && num1>num3) {
     System.out.println("The largest number is:"+num1); }
  else if (num2>num1 && num2>num3) {
     System.out.println("The largest number is:"+num2); }
  else {
     System.out.println("The largest number is:"+num3); } 
 }
}

