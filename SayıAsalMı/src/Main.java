import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int number = scan.nextInt();
			
		int remainder = number % 2;
		
		boolean isPrime = true;
		
		if(number<2) {
		System.out.println("Invalid Number ");	
		return;
		}
		
		for(int i = 2 ; i<number ; i++) {
			remainder= number % i;
			if(remainder == 0 ) {
				isPrime = false;
			}
		}
		
		
		if(isPrime) {
			System.out.println(number + " is prime number");
		}
		else {
			System.out.println(number + " is not prime number");
		}

	}

}
