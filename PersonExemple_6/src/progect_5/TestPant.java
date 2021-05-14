package progect_5;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPant {

	public static void executePant() {

		//createAndTestObjectsPant();
		TestMyNewPant();
	}

		 public static void TestMyNewPant() {

				//create an object without parameters class Pant,
				Pant p1 = new Pant("Levi's ","red ", "L", 150);
				Pant p2 = new Pant("Zarra ","black ", "M", 35);
				Pant p3 = new Pant("Chino", "blue ", "S", 15);
				
				ArrayList<Pant> listaPant = new ArrayList<Pant>();
				// ahora añado dentro de la lista pantalones
				
				listaPant.add(p1); //en la lista de pantalones tengo tres elementos 
				listaPant.add(p2);
				listaPant.add(p3);
				
				Scanner scanner = new Scanner(System.in);
		         
				System.out.println("Give your name: ");
				String name = scanner.nextLine(); //el programa llegeix el que ha introduït l'usuari, i guarda en la variable name;
				
				System.out.println("Give your gender: ");
				String gender = scanner.nextLine();
				
				System.out.println("Give your height: ");
				int height = Integer.valueOf(scanner.nextLine());//con methodo_valueOf_ transforma la linia de texto en xifre;
				
				System.out.println("Give your weight: ");
				int weight = Integer.valueOf(scanner.nextLine());
				
				
				
				Person user = new Person (name, gender, height, weight);
				user.calculSizePants(); //accedo al metodo calcular talla en classPerson
				
				

				for (Pant pant : listaPant) { // bucle de buscar la talla de pantalon 
			        if (pant.sizePants.equals(user.sizePants)) {//...que sea la misma de de la talla de usuario			        	
			        	user.listaPant.add(pant);
			        	System.out.println("tu pantalon es " + pant);
			        	break;
			        }
			     
			    }
			
				TestPant.printPants(user.listaPant); // TOT aquest metod llama el metod d'abaix.
			}
		 
		 public static void printPants(ArrayList<Pant> arrayToPrint) {

				System.out.println("Pants:\n"); //Pants: (brand=Levi's , color=red , sizePants=L, price=150)
			
				for (Pant pantToPrint : arrayToPrint) {
					System.out.println(pantToPrint);
				}
				
				System.out.println("\n");
		 }
	
}

