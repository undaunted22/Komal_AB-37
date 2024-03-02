package practice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptnHndlngAssgn {

	public static void main(String[] args) {
       try {
    	   Scanner s=new Scanner(System.in);
    	   System.out.println("Enter something");
    	   int a=s.nextInt();	
    	   int c=1/0;
    	  
    	  }
       catch(ArithmeticException a2) {
    	   System.out.println("This exception is being handled by catch block1");
       }
       catch(InputMismatchException a1) {
    	   System.out.println("This exception is being handled by catch block2");   
       }
       finally {
    	   System.out.println("no matter what i will always give the answer");
       }
	}
}
