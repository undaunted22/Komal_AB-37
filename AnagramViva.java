package practice;

import java.util.Arrays;

public class AnagramViva {

	public static void main(String[] args) 
	{
       String s1="komal";
       String s2="komal";
       
       if(s1.length()!=s2.length()) {
    	   System.out.println("not a anagram");
       }
       else {
    	   char a[]=s1.toCharArray();
    	   char b[]=s2.toCharArray();
    	   Arrays.sort(a);
    	   Arrays.sort(b);
    	   System.out.println(Arrays.toString(a));
    	   System.out.println(Arrays.toString(b));
    	   if(Arrays.equals(a, b)==true) {
    		   System.out.println("its an anagram for 2 strings");
    	   }
    	   else {
    		   System.out.println("its not an anagram at all");
    	   }
       }
	}

}
