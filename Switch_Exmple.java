package practice;

import java.util.Scanner;

public class Switch_Exmple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		System.out.println("Enter value of c");
		int c = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("addition :" + (b + c));
			// break;
		case 2:
			System.out.println("subtraction :" + (b - c));
			// break;
		case 3:
			System.out.println("multiplication :" + (b * c));
			// break;
		case 4:
			System.out.println("division :" + (b / c));
			// break;
		default:
			System.out.println("I am default line");
		}
		sc.close();
	}

}
