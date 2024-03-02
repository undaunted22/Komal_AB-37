package practice;

public class Palindrome2 {

	public static void main(String[] args) {
		String a="abcdedcb";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		System.out.println(b);
		if(a.equals(b)) {
			System.out.println("its a palindrome string");
		}
		else {
			System.out.println("not a palindorme");
		}
	}

}
