package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class This_Demo {

	public static void main(String[] args)
	{
		
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter something here");
			boolean b=sc.nextBoolean();
		}
		catch(ArithmeticException e1)
		{
			System.out.println("handles arithmetic exception");
		}
		catch(InputMismatchException e2)
		{
			System.out.println("handles input mismatch exception");
		}
		finally {
			System.out.println("thankyou for your visit");
		}

	}

}