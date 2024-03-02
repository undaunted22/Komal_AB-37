package practice;
class Three {
	void m3() {
		System.out.println("3");
	}
}
class Two extends Three {
	void m2() {
		System.out.println("2");
	}
}
class One extends Two {
	void m1() {
		System.out.println("1");
	}
}
public class Example_Upcasting extends One {
	void m() 
	{
		System.out.println("child class's method");
	}
	public static void main(String[] args) 
	{
		Two t= new One();
		t.m2();
		t.m3();
		One o=(One)t;
		o.m1();
		o.m2();
		o.m3();
		
	}
}
 
