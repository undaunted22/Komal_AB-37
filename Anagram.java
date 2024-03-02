package practice;//Check if 2 given strings are anagram of each other or not

import java.util.Arrays;

public class Anagram { 
	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		if(s1.length()!=s2.length()) {
			System.out.println("not an anagram of each other");
		}
		else {
			char a[]=s1.toCharArray();
			char b[]=s2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			if(Arrays.equals(a, b)==true) {
				System.out.println("its an ANAGRAM");
			}
			else {
				System.out.println("not an anagram");
			}
		}
	}
    
    }  
  