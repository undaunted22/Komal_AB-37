package practice;

public class SentenceReverse {

	public static void main(String[] args) {
		String m1="My name is MANISH";
		System.out.println(m1);
		for(int i=m1.length()-1;i>=0;i--)
		{
			System.out.print(m1.charAt(i));
		}
	}

}
