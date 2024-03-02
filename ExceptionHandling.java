package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter something  here");
		
		
	
	try {
		boolean a=sc.nextBoolean();
	}
	catch(InputMismatchException e) 
	{
		System.out.println("error");
	}
	sc.close();
}
}