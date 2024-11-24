import java.util.Scanner ;  //import statement
 
public class IT24104201Lab5Q2 {  //class definition
 public static void main(String[] args) {  //main method

 Scanner input=new Scanner(System.in);  //create a Scanner object
 
 System.out.print("Enter the number of new members introduced:"); //input the number of new members to introduce
 int prize=input.nextInt();


 //It checks if the entered value is 0 or greater
 if (prize<0) {
   System.out.println("Input must be a number 0 or greater");  } 
 
 else { 

 System.out.println(""); //It prints blank line

 switch(prize) {
  case 0:
    System.out.println("No Prize");
    break;
  case 1:
    System.out.println("Prize is a : Pen");
    break;
  case 2:
    System.out.println("Prize is a : Umbrella");
    break;
  case 3:
    System.out.println("Prize is a : Bag");
    break;
  case 4:
    System.out.println("Prize is a : Travelling Chair");
    break;
  default:
    System.out.println("Prize is a : Headphone");
   }
  }
 }
}
   
 

