package practice;

//import java.util.Arrays;

public class Reverse_Str {

	public static void main(String[] args) {
		String s="create new";
		 char a[]=s.toCharArray();
		 for(int i=a.length-1;i>=0;i--) {
			 System.out.print(a[i]);
		 }
	}
}
