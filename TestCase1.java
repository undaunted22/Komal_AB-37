package practice;
class ExcelSheet{
	void DataFetching() {
		System.out.println("parent class method");
		
	}
}
public class TestCase1 extends ExcelSheet{
	void LoginLogout() {
		
	}
	

	public static void main(String[] args) 
	{
		         ExcelSheet e1=new TestCase1(); //upcasting;
		         e1.DataFetching();
		         
	}

}
