package practice; /*write a program for hierarchical inheritance and 
create three separate classes(son, daughter, parent) */

public class Daughter1 extends Par1{
	void meth3() {
		System.out.println("this is main method's daughter method execution");
	}

	public static void main(String[] args) {
      Daughter1 d=new Daughter1();
      d.meth3();
      d.meth2();
	}
}
