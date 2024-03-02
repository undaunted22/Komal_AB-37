package practice;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of base");
		double b=sc.nextDouble();
		System.out.println("Enter value of height");
		double h=sc.nextDouble();
		double Area_of_triangle=((0.5)*b*h);
		System.out.println("Area of the triangle is " + Area_of_triangle);
		
	}

}
