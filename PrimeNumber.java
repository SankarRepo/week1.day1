package week1.day1;

public class PrimeNumber {
	
public static void main(String[] args) {
 int num = 13;
 boolean prime = true;
 
 for (int i=2; i<num; i++) 
     {
	 if (num%i==0) 
	   {
		 System.out.println("not a prime number");
		 prime = false;
		 break;
		 
	   }
	
	 }
 if (prime == true) {
	 System.out.println("prime number");
 }
 }
	
}