package practice;

import java.util.Scanner;

public class Addition_Scanner
{
	public static void main(String[] args) {
		int sum,num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		sc.close();
		sum=num1+num2;
		System.out.println(sum);
	}
	
	
}
