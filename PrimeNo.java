package practice;

public class PrimeNo {

	public static void main(String[] args) {
       int n=23;
       boolean prime=true;
       for(int i=2;i<n;i++) {
    	   if(n%i==0) {
    		   prime=false;
    		   break;
    	   }
       }
       System.out.println(prime);
	}

}
