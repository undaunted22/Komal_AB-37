package practice; /*WAP for single level inheritance where gk method(child) is static and 
parent(selenium and java) are non static*/
class Parent
{
	void selenium() {
		System.out.println("this is selenium method execution");
	}
	void java() {
		System.out.println("this is java method execution");
	}
}
public class Child extends Parent {
	static void gk() {
		System.out.println("this is child  method execution");
	}
	public static void main(String[] args)
	{
      Child c=new Child();
      c.selenium();
      c.java();
      gk();
	}
}
