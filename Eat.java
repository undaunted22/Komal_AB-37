package practice; /*create a class and create two concrete methods inside 
a class(static add, non static sub), create abstract class and create two abstract 
methods (multiplication, divison), 
create two concrete methods inside main method*/
abstract class walk{
 abstract void multiplication();
 abstract void division();	
}
public class Eat extends walk{
	static void add() {
		System.out.println("this is a concrete static add method");
	}
	void subtraction() {
		System.out.println("this is non static subtraction method");
	}

	
	public static void main(String[] args) {
		Eat e=new Eat();
		e.multiplication();
		e.division();
		add();
		e.subtraction();
	}
	void multiplication() {
System.out.println("this is execution of multiplication");		
	}
	 
	void division() {
  System.out.println("this is execution of division");		
	}

}
