package progect_5;

import java.util.Scanner;
import java.util.ArrayList;

public class TestPerson {

	public static void executePerson() { 
		// is a method that I will call this Int;
		Scanner scanner = new Scanner(System.in);
         
		System.out.println("Give your name: ");
		// the program reads what the user has entered and saves the variable_name;
		String name = scanner.nextLine(); 
		
		System.out.println("Give your gender: ");
		String gender = scanner.nextLine();
		
		System.out.println("Give your height: ");
		///with the method_valueOf_ transforms the line of text into number;
		int height = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Give your weight: ");
		int weight = Integer.valueOf(scanner.nextLine());
		
		//now I "build" the person second the variables donated by user;
				Person user = new Person (name, gender, height, weight);
				user.calculSizePants(); 
				
				System.out.println("Your size is: " + user.sizePants);
	}
	

}



	

	
	