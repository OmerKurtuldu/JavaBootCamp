import java.util.Iterator;

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
		
		System.out.println("DO-While loop finished ");
		System.out.print("\n");
		
		
		//ARRAYS
		
		String[] students = new String[3];
		students[0] = "Ömer";
		students[1] = "Ahmet";
		students[2] = "Mehmet";
		
		
		for (int k = 0; k < students.length; k++) {
			
			System.out.println(students[k]);
		}
		
	   System.out.println("------------------------");
		
	   for(String student:students) {
	    	
	    	System.out.println(student);
	    	
	    } 
	   System.out.println("------------------------");
	   
	   
	   
	   //ARRAY EXAMPLE
	   
	   double[] myList = {1.2,1.6,1.8,5.6};
	   double sum = 0;
	   double max = myList[0];
	   
	   for(double nmbr:myList) {
		   if(max<nmbr) {
			  max = nmbr; 
		   }
		   
		   sum = sum + nmbr;
		   System.out.println(nmbr);
	   }
	   System.out.println("Sum = " + sum);
	   System.out.println("Max number " + max);
	   
		
	   System.out.println("------------------------");
	  
	   //MULTIDIMENSIONAL ARRAY 
	   
	   String[][] cities = new String[3][3]; 
		
		cities[0][0] = "İstanbul";
		cities[0][1] = "Sakarya";
		cities[0][2] = "Kocaeli";
		cities[1][0] = "Balıkesir";
		cities[1][1] = "Bursa";
		cities[1][2] = "Düzce";
		cities[2][0] = "Tekirdağ";
		cities[2][1] = "Edirne";
		cities[2][2] = "Bilecik";
				
			
		for(int s = 0 ;  s<= 2 ; s++){
			for(int a = 0 ; a <= 2; a++)
			{
				System.out.println(cities[s][a]);       
			}
		}
			
		System.out.println("------------------------");
		
		//STRİNG
			
		
		String message = "The weather is very nice today";
		System.out.println(message);
		
		
		System.out.println("Number of elements =" + message.length());//Stringin uzunluğunu yazar
		System.out.println("5th elememt = "+ message.charAt(4));//istediğimiz indexteki elemana ulaşır
		System.out.println(message.concat(" Wonderful!!"));//ifadenin sonuna istediğimiz metni ekleyebiliriz
		System.out.println(message.startsWith("T"));//Yazılan harfle başlayıp başlamadığını tru false döndürür
		System.out.println(message.endsWith("A"));
		char[] characters = new char [5];
		message.getChars(0, 5,characters,0);	
		System.out.println(characters);
		System.out.println(message.indexOf('a'));
		
		String newMessage = message.replace(' ', '_');
		System.out.println(newMessage);	
			
		System.out.println(message.substring(4));	
		
	}
}