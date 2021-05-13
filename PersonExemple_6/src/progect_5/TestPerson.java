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
	
	public static void createAndTestObjectsPant() {

		// create an object without parameters class Pant,
		Pant p1 = new Pant("Levi's ","red ", "L", 150);
		Pant p2 = new Pant("Zarra ","black ", "M", 35);
		Pant p3 = new Pant("Chino", "blue ", "S", 15);
		
		// p1 object, calls toString Method
		p1.toString();
		System.out.println(p1.toString());
		
		p2.toString();
		System.out.println(p2.toString());
		
		p3.toString();
		System.out.println(p3.toString());
	}

	public static void testListPantPerson() {
		ArrayList<Pant> pants = new ArrayList<Pant>();
		
		// create three Pant Objects
		Pant p1 = new Pant("Levi's ","red ", "L", 150);
		Pant p2 = new Pant("Zarra ","black ", "M", 35);
		Pant p3 = new Pant("Chino", "blue ", "S", 15);
		
		// we add the previous created objects to pants ArrayList
		pants.add(p1);
		pants.add(p2);
		pants.add(p3);
		
		System.out.println(pants.toString());
		//printPants(pants);
		
	}
	public static void printPants(ArrayList<Pant> arrayToPrint) {

		System.out.println("Pants:\n");

		for (Pant pantToPrint : arrayToPrint) {
			System.out.println(pantToPrint);
		}
		
		System.out.println("\n");
   }
}



	

	
	