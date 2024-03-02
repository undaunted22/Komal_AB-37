package practice; /*WAP for single level inheritance in a single program and make all
methods non static(selenium,java,gk) 
by creating object in child class*/
class Second{
	void selenium() {
		System.out.println("this is selenium method execution");
	}
	void java() {
		System.out.println("this is java method execution");
	}
	void gk() {
		System.out.println("this is gk method execution");
	}
}
public class First extends Second{
	public static void main(String[] args) {
      First f=new First();
      f.selenium();
      f.java();
      f.gk();
	}

}
