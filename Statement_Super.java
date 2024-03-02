package practice;
class State_Class {
	State_Class(String a) {
		System.out.println("1");
	}
}
public class Statement_Super extends State_Class {
	Statement_Super() {
		super("Ram"); /*
						 * used to call the parent class constructor from the child class constructor.
						 * Super calling statement is always the first line in a given constructor.
						 * super calling statements are of 2 types 1.parameterized super calling
						 * statement 2.Non paramaetrized super calling statment-->Non parameterized
						 * super calling statement can be called in 2 ways i) Implicitl way. ( means
						 * dont write it its present) ii)Explicitl way.
						 */
		// Parameterized super calling statement can only be written in an explicit way
		System.out.println("2");
	}
	public static void main(String[] args) {
		Statement_Super s = new Statement_Super();
	}

}
