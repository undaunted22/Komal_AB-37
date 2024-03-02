package practice;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of the radius");
        int radius=sc.nextInt();
        final double pi=3.14;
        double area=pi*radius*radius;
        System.out.println("Area of the circle is " +area);
        
	}

}
