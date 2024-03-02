package practice;

import java.util.Arrays;

public class TestAnagrm {

	public static void main(String[] args) {
         String s1="LISTEN";
         String s2="SILENT";
         if(s1.length()!=s2.length())
         {
        	 System.out.println("the 2 strings are not an anagram of each other");
         }
         else {
        	 char input1[]=s1.toCharArray();
        	 char input2[]=s2.toCharArray();
        	 Arrays.sort(input1);
        	 Arrays.sort(input2);
        	 System.out.println(Arrays.toString(input1));
        	 System.out.println(Arrays.toString(input2));
        	 if(Arrays.equals(input1, input2)==true)
        	 {
        		 System.out.println("its an anagram");
        	 }
        	 else {
        		 System.out.println("its not an anagram");
        	 }
         }
	}

}
