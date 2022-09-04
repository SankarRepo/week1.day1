package week1.day1;

public class Prime {
	
public static void main(String[] args) {
	/*
	
	int i, j, isPrime, n;
    System.out.println("All Prime Numbers Between 1 to 100");

    // For every number between 2 to 100, check
    //  whether it is prime number or not
    for (i = 2; i <= 100; i++) {
        isPrime = 0;
        // Check whether i is prime or not
        for (j = 2; j <= i / 2; j++) {
            // If any number between 2 to i/2 divides i
            // completely then i cannot be prime number
            if (i % j == 0) {
                isPrime = 1;
                break;
            }
        }

        if (isPrime == 0)
            System.out.print(i + " ");
    }

} */
	int n=99;
	int count =0;		
	for (int i=1;i<=n;i++) {
		if (n % i == 0) {
			count++;
				
			}
		}
		if (count==2) {
			System.out.println("prime");
	} else {
		System.out.println("not prime");
	}

}
}