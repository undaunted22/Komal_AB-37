package practice;   //EPOCH CONVERTER

import java.util.Date;

public class Epoch_Date {

	public static void main(String[] args) {
		System.out.println("WAP to display system time and date,store day,date,momth and year value in a String");
     Date d1=new Date();   //comes from java util package.
     System.out.println(d1.getTime()); //this is the epoch time, we need to convert
     
     Date d2=new Date(d1.getTime()); //passing the parameter to invoke its constructor.
     System.out.println(d2);
   /*  String mydate=d2.toString();   //converting the date into the String.
     String year=mydate.substring(24);
     System.out.println(year);
	 String month=mydate.substring(4,7);
	 System.out.println(month);
	 String date=mydate.substring(8,10);
	 System.out.println(date);
	 String day=mydate.substring(0,3);
	 System.out.println(day);
	 
	 System.out.println(date.concat(month).concat(year));
	 System.out.println(date.concat(("/").concat(month).concat("/").concat(year))); */
	
	}

}
