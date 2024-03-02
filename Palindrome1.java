package practice;
public class Palindrome1 {
	public static void main(String arg[]) {
		String s="radar";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
		  s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		if(s.equals(s1)) {
			System.out.println("its a palindrome");
		}
		else
		{
		  System.out.println("not a palindrome");	
		}
		
	}
}
