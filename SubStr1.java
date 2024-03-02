package practice;

public class SubStr1 {

	public static void main(String[] args) 
	{
     String a2="India is a country";
     String a3=a2.substring(0, 5); //India
     String a4=a2.substring(6, 8); // is 
     String a5=a2.substring(9, 10); //a
     String a6=a2.substring(11, 18); // country
     String a7=a3.concat(a4).concat(a5).concat(a6); //India is a country
     System.out.println(a7);   
     System.out.println(a2.substring(0, 5));
     System.out.println(a2.substring(6, 8));
     System.out.println(a2.substring(9, 10));
     System.out.println(a2.substring(11, 18));
     
     
	}

}
