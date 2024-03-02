package practice;

public class Scalar_Palindrome {

	public static void main(String[] args) {
  String a="scalar";
  String b="";
  for(int i=a.length()-1;i>=0;i--) {
	  b=b+a.charAt(i);
  }
  System.out.println(b);
  if(a.equals(b)) {
	  System.out.println("its a plaindrome");
  }
  else {
	  System.out.println("its not a palindrome");
  }
	}

}
