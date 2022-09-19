
public class Main {

	public static void main(String[] args) {
		
		//Hello World
		System.out.println("Hello World!");
		
		
		//Variables
		int numberOfStudents = 9;		
		String name =  "Number of students = ";
		System.out.println(name + numberOfStudents);
		
		
		//Conditionals
		
		int number = 20;
		
		if(number<20){
			
			System.out.println("Number less than " + number );
			
		}
		else if(number>20) {
			System.out.println("Number greater than " + number );
		}
		
		else {
			System.out.println("Number equal to " + number );
		}
			
		
		//Find max number
		
		int number1 = 12;
		int number2 = 22;
		int number3 = 36;
		
		
		int maxValue = number1;
		
		if(maxValue < number2) {
			
			maxValue = number2;
		}
		
		if (maxValue < number3) {
			
			maxValue = number3;
		}
		
		System.out.println("Max number is " + maxValue );
		
		//SwitchCase
		
		char grade = 'A';
		
		switch(grade) {
		case  'A':
			System.out.println("Passed the lesson ");
			break;
		case 'F' :
			System.out.println("Failed the lesson ");
			break;
		}
		
		
		//LOOPS (FOR LOOPS)
		
		char character = '*';
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				
				System.out.print(character);
			}
			
			System.out.print("\n");
			
		}
		System.out.println("For loop finished ");
		
		//LOOPS (WHİLE LOOPS)
		
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While loop finished ");
		
		//LOOPS (DO-WHİLE)
		
		int j = 1;
		
		do {
			System.out.println(j);
			j++;				
		}while(j<10);
		
		
		
			
		
			
			
			
			
			
			
			
			
			
			
			
		
			
	}

}
