package practice; /*write a program for hierarchical inheritance and create a three 
classes(son, daughter, parent) in a single program*/
class Par{
	void meth1() {
		System.out.println("parent class execution");
	}
}
class Son{
	void meth2() {
		System.out.println("Son class execution");
	}
}
public class Daughter extends Par{
	void meth3(){
		System.out.println("this is daughter execution");
	}
	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.meth1();
		d.meth3();
	}
}
