package practice; //If the character is A, E, I, O, or U, 
					//it is vowel otherwise consonant. It is not case-sensitive.

import java.util.Scanner;
public class switch_case {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the alphabet");
		String ch = s.next();

		switch (ch) {
		case "a":
			System.out.println("Vowel");
			break;
		case "e":
			System.out.println("Vowel");
			break;
		case "i":
			System.out.println("Vowel");
			break;
		case "o":
			System.out.println("Vowel");
			break;
		case "u":
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Its a consonant");
		}
		s.close();
	}
}
