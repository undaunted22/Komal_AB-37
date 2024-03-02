package practice;

public class Str {
	public static void main(String[] args) {
      String s="komal2294";
      char c[]=s.toCharArray();	
      
      for(int i=0;i<s.length();i++) {
    	  
    	  boolean answer=Character.isDigit(c[i]);
    	  if(answer== true) {
    		  System.out.println(c[i]+ " is not a digit "+ answer);
    	  }
    	  else{
    		System.out.println(c[i]+ " is a digit "+answer);
    			
    	  }
       	  }
      }
     
	}

