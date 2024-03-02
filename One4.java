package practice;/*WAP for multilevel inheritance in a single program 
and make all the methods as non static*/
class Three3{
	void meth3() {
		System.out.println("execution of meth 3");
	}
}
class two2 extends Three3{
	void meth2() {
		System.out.println("execution of meth2");
	}	
}
public class One4 extends two2 
{
	public static void main(String[] args) {
		One4 o=new One4();
		o.meth3();
		o.meth2();	
	}
}
