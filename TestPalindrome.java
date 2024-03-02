package practice;

public class TestPalindrome {

	public static void main(String[] args)
	{
       String a="tat";
       String b="";
       for(int i=a.length()-1;i>=0;i--) 
       {
    	b=b+a.charAt(i);
    	System.out.println(b);
       }
       if(a.equals(b))
       {
    	System.out.println("its a palindorme");   
       }
       else {
    	   System.out.println("its not a palindrome");
       }
       
	}

}
