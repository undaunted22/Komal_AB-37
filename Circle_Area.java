package practice;

public class Circle_Area {
	static final double pi = 3.14;
	void radius1() {
		int r1 = 7;
		double area1 = pi * r1;
		System.out.println(area1);
	}
	void radius2() {
		int r2 = 9;
		double area2 = pi * r2;
		System.out.println(area2);
	}
	public static void main(String[] args) {
		Circle_Area a = new Circle_Area();
		System.out.println("Area of circle1");
		a.radius1();
		System.out.println("Area of circle2");
		a.radius2();
	}

}
