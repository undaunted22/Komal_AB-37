package practice;

public class SubStr2 {

	public static void main(String[] args) {
		String s = "GroTechMinds";
		String s9 = s.substring(0, 3); //Gro
		String s8 = s.substring(3, 7);  //Tech
		String s7 = s.substring(7, 12);  //Minds
		String s6 = s9.concat(s8).concat(s7); //GroTechMinds
		System.out.println(s6);  //GroTechMinds
		int a = 10;
		if (a == 10) {
			System.out.println("hello");   //hello

		} else {
			System.out.println("hi");

		}
		String x = "Assam";
		x.indexOf(s); 

		System.out.println(x.indexOf('s'));
	}

}
