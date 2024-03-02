package practice;

class Upcasting3
{
	void Upcast3()             //method overriding
	{
		System.out.println("3");
	}
}
class Upcasting2 extends Upcasting3
{
	void Upcast2() 
	{
		System.out.println("2");
	}
}
class Upcasting1 extends Upcasting2
{
	void Upcast1()
	{
		System.out.println("1");
	}
}
public class Upcasting extends Upcasting1
{
        void Upcast() 
        {
        	System.out.println("4");	
        	
        }
	
	public static void main(String[] args)
	{
         Upcasting2 u1=new Upcasting1();
         u1.Upcast2();
         u1.Upcast3(); 
		
	}

}
