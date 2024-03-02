package practice;

import java.util.Scanner;

public class ExcptnHndlngAssgn
	
	{
	public static void main(String[] args) 
	{
    	  Scanner sc=new Scanner(System.in) ;
    	  System.out.println("enter the age");
    	  int age=sc.nextInt();
    	  
    	  
    	  try 
    	  {
    		if(age>18) {
    			System.out.println("you are allowed to visit the website www.google.com");
    		}
    		else {
    			throw new ArithmeticException("You are under 18 years old.");
    		}
    	  }
    	  catch(ArithmeticException e)
    	  {
    		  System.out.println("access denied " +e.getMessage());
    	  }
	
	}
}
	
			    
			  /*      Scanner scanner = new Scanner(System.in);
			        System.out.print("Enter your age: ");
			        int age = scanner.nextInt();
			        scanner.close();

			        try {
			            if (age > 18) {
			                System.out.println("You are allowed to visit google.com.");
			                // Here you would navigate to google.com using appropriate code
			            } else {
			                throw new ArithmeticException("You are under 18 years old.");
			            }
			        } catch (ArithmeticException e) {
			            System.out.println("Access denied: " + e.getMessage());
			        }
			    }
			} 
			*/
