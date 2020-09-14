import java.util.Scanner;
/**
 * program to find if integer is odd or even
 * @author Darian Pajic
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask the user to enter an integer 
  System.out.println("Please enter an integer:");
  int num = input.nextInt();
    
  // find out if the integer is odd or even
  if (num % 2 == 0){
    System.out.println(num + " is an even number");
  }else{
    System.out.println(num + " is an odd number");
    
  }

  
  }
}