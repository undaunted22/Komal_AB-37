package practice;

public class PriTypeCasting {

	public static void main(String[] args) {
       // 1st problem  //given weight is in int,convert it into double
		   double myweight=90;  //widening   implicit 
		   System.out.println(myweight);
		   
		   //2nd problem   given weight is in double convert it into int datatype.
		    int yourweight= (int)67.12;  //narrowing explicitly
		    System.out.println(yourweight);
		    
		    //3rd problem
		    // current age is in byte datatype convert it into short datatype.
		    byte a1=20; 
		           short a2 =a1;  //can be done implicitly and explicitly.
		           System.out.println(a2);
		    
		    
		   
		    
		    
	}

}
